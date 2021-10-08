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
import com.ruoyi.business.domain.WtConstructionPermits;
import com.ruoyi.business.service.IWtConstructionPermitsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 施工许可Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/permits")
public class WtConstructionPermitsController extends BaseController
{
    @Autowired
    private IWtConstructionPermitsService wtConstructionPermitsService;

    /**
     * 查询施工许可列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtConstructionPermits wtConstructionPermits)
    {
        startPage();
        List<WtConstructionPermits> list = wtConstructionPermitsService.selectWtConstructionPermitsList(wtConstructionPermits);
        return getDataTable(list);
    }

    /**
     * 导出施工许可列表
     */
    @Log(title = "施工许可", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtConstructionPermits wtConstructionPermits)
    {
        List<WtConstructionPermits> list = wtConstructionPermitsService.selectWtConstructionPermitsList(wtConstructionPermits);
        ExcelUtil<WtConstructionPermits> util = new ExcelUtil<WtConstructionPermits>(WtConstructionPermits.class);
        return util.exportExcel(list, "施工许可数据");
    }

    /**
     * 获取施工许可详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtConstructionPermitsService.selectWtConstructionPermitsById(id));
    }

    /**
     * 新增施工许可
     */
    @Log(title = "施工许可", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtConstructionPermits wtConstructionPermits)
    {
        return toAjax(wtConstructionPermitsService.insertWtConstructionPermits(wtConstructionPermits));
    }

    /**
     * 修改施工许可
     */
    @Log(title = "施工许可", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtConstructionPermits wtConstructionPermits)
    {
        return toAjax(wtConstructionPermitsService.updateWtConstructionPermits(wtConstructionPermits));
    }

    /**
     * 删除施工许可
     */
    @Log(title = "施工许可", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtConstructionPermitsService.deleteWtConstructionPermitsByIds(ids));
    }
}
