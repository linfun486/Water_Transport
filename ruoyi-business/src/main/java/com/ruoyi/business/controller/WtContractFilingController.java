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
import com.ruoyi.business.domain.WtContractFiling;
import com.ruoyi.business.service.IWtContractFilingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同备案Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/filing")
public class WtContractFilingController extends BaseController
{
    @Autowired
    private IWtContractFilingService wtContractFilingService;

    /**
     * 查询合同备案列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtContractFiling wtContractFiling)
    {
        startPage();
        List<WtContractFiling> list = wtContractFilingService.selectWtContractFilingList(wtContractFiling);
        return getDataTable(list);
    }

    /**
     * 导出合同备案列表
     */
    @Log(title = "合同备案", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtContractFiling wtContractFiling)
    {
        List<WtContractFiling> list = wtContractFilingService.selectWtContractFilingList(wtContractFiling);
        ExcelUtil<WtContractFiling> util = new ExcelUtil<WtContractFiling>(WtContractFiling.class);
        return util.exportExcel(list, "合同备案数据");
    }

    /**
     * 获取合同备案详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtContractFilingService.selectWtContractFilingById(id));
    }

    /**
     * 新增合同备案
     */
    @Log(title = "合同备案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtContractFiling wtContractFiling)
    {
        return toAjax(wtContractFilingService.insertWtContractFiling(wtContractFiling));
    }

    /**
     * 修改合同备案
     */
    @Log(title = "合同备案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtContractFiling wtContractFiling)
    {
        return toAjax(wtContractFilingService.updateWtContractFiling(wtContractFiling));
    }

    /**
     * 删除合同备案
     */
    @Log(title = "合同备案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtContractFilingService.deleteWtContractFilingByIds(ids));
    }
}
