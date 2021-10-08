package com.ruoyi.business.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.business.domain.WtSectionProjectOverview;
import com.ruoyi.business.service.IWtSectionProjectOverviewService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标段工程概况Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/overview")
public class WtSectionProjectOverviewController extends BaseController
{
    @Autowired
    private IWtSectionProjectOverviewService wtSectionProjectOverviewService;

    /**
     * 查询标段工程概况列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtSectionProjectOverview wtSectionProjectOverview)
    {
        startPage();
        List<WtSectionProjectOverview> list = wtSectionProjectOverviewService.selectWtSectionProjectOverviewList(wtSectionProjectOverview);
        return getDataTable(list);
    }

    /**
     * 导出标段工程概况列表
     */
    @Log(title = "标段工程概况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtSectionProjectOverview wtSectionProjectOverview)
    {
        List<WtSectionProjectOverview> list = wtSectionProjectOverviewService.selectWtSectionProjectOverviewList(wtSectionProjectOverview);
        ExcelUtil<WtSectionProjectOverview> util = new ExcelUtil<WtSectionProjectOverview>(WtSectionProjectOverview.class);
        return util.exportExcel(list, "标段工程概况数据");
    }

    /**
     * 获取标段工程概况详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtSectionProjectOverviewService.selectWtSectionProjectOverviewById(id));
    }

    /**
     * 新增标段工程概况
     */
    @Log(title = "标段工程概况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtSectionProjectOverview wtSectionProjectOverview)
    {
        return toAjax(wtSectionProjectOverviewService.insertWtSectionProjectOverview(wtSectionProjectOverview));
    }

    /**
     * 修改标段工程概况
     */
    @Log(title = "标段工程概况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtSectionProjectOverview wtSectionProjectOverview)
    {
        return toAjax(wtSectionProjectOverviewService.updateWtSectionProjectOverview(wtSectionProjectOverview));
    }

    /**
     * 删除标段工程概况
     */
    @Log(title = "标段工程概况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtSectionProjectOverviewService.deleteWtSectionProjectOverviewByIds(ids));
    }
}
