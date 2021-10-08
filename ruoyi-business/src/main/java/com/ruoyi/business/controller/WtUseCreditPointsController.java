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
import com.ruoyi.business.domain.WtUseCreditPoints;
import com.ruoyi.business.service.IWtUseCreditPointsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 信用分使用情况Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/points")
public class WtUseCreditPointsController extends BaseController
{
    @Autowired
    private IWtUseCreditPointsService wtUseCreditPointsService;

    /**
     * 查询信用分使用情况列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtUseCreditPoints wtUseCreditPoints)
    {
        startPage();
        List<WtUseCreditPoints> list = wtUseCreditPointsService.selectWtUseCreditPointsList(wtUseCreditPoints);
        return getDataTable(list);
    }

    /**
     * 导出信用分使用情况列表
     */
    @Log(title = "信用分使用情况", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtUseCreditPoints wtUseCreditPoints)
    {
        List<WtUseCreditPoints> list = wtUseCreditPointsService.selectWtUseCreditPointsList(wtUseCreditPoints);
        ExcelUtil<WtUseCreditPoints> util = new ExcelUtil<WtUseCreditPoints>(WtUseCreditPoints.class);
        return util.exportExcel(list, "信用分使用情况数据");
    }

    /**
     * 获取信用分使用情况详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtUseCreditPointsService.selectWtUseCreditPointsById(id));
    }

    /**
     * 新增信用分使用情况
     */
    @Log(title = "信用分使用情况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtUseCreditPoints wtUseCreditPoints)
    {
        return toAjax(wtUseCreditPointsService.insertWtUseCreditPoints(wtUseCreditPoints));
    }

    /**
     * 修改信用分使用情况
     */
    @Log(title = "信用分使用情况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtUseCreditPoints wtUseCreditPoints)
    {
        return toAjax(wtUseCreditPointsService.updateWtUseCreditPoints(wtUseCreditPoints));
    }

    /**
     * 删除信用分使用情况
     */
    @Log(title = "信用分使用情况", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtUseCreditPointsService.deleteWtUseCreditPointsByIds(ids));
    }
}
