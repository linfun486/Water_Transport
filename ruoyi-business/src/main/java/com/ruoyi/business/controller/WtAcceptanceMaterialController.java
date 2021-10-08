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
import com.ruoyi.business.domain.WtAcceptanceMaterial;
import com.ruoyi.business.service.IWtAcceptanceMaterialService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 交工验收材料Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/material")
public class WtAcceptanceMaterialController extends BaseController
{
    @Autowired
    private IWtAcceptanceMaterialService wtAcceptanceMaterialService;

    /**
     * 查询交工验收材料列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        startPage();
        List<WtAcceptanceMaterial> list = wtAcceptanceMaterialService.selectWtAcceptanceMaterialList(wtAcceptanceMaterial);
        return getDataTable(list);
    }

    /**
     * 导出交工验收材料列表
     */
    @Log(title = "交工验收材料", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        List<WtAcceptanceMaterial> list = wtAcceptanceMaterialService.selectWtAcceptanceMaterialList(wtAcceptanceMaterial);
        ExcelUtil<WtAcceptanceMaterial> util = new ExcelUtil<WtAcceptanceMaterial>(WtAcceptanceMaterial.class);
        return util.exportExcel(list, "交工验收材料数据");
    }

    /**
     * 获取交工验收材料详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtAcceptanceMaterialService.selectWtAcceptanceMaterialById(id));
    }

    /**
     * 新增交工验收材料
     */
    @Log(title = "交工验收材料", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        return toAjax(wtAcceptanceMaterialService.insertWtAcceptanceMaterial(wtAcceptanceMaterial));
    }

    /**
     * 修改交工验收材料
     */
    @Log(title = "交工验收材料", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtAcceptanceMaterial wtAcceptanceMaterial)
    {
        return toAjax(wtAcceptanceMaterialService.updateWtAcceptanceMaterial(wtAcceptanceMaterial));
    }

    /**
     * 删除交工验收材料
     */
    @Log(title = "交工验收材料", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtAcceptanceMaterialService.deleteWtAcceptanceMaterialByIds(ids));
    }
}
