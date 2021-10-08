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
import com.ruoyi.business.domain.WtPaymentRecords;
import com.ruoyi.business.service.IWtPaymentRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 付款记录Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/records")
public class WtPaymentRecordsController extends BaseController
{
    @Autowired
    private IWtPaymentRecordsService wtPaymentRecordsService;

    /**
     * 查询付款记录列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtPaymentRecords wtPaymentRecords)
    {
        startPage();
        List<WtPaymentRecords> list = wtPaymentRecordsService.selectWtPaymentRecordsList(wtPaymentRecords);
        return getDataTable(list);
    }

    /**
     * 导出付款记录列表
     */
    @Log(title = "付款记录", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtPaymentRecords wtPaymentRecords)
    {
        List<WtPaymentRecords> list = wtPaymentRecordsService.selectWtPaymentRecordsList(wtPaymentRecords);
        ExcelUtil<WtPaymentRecords> util = new ExcelUtil<WtPaymentRecords>(WtPaymentRecords.class);
        return util.exportExcel(list, "付款记录数据");
    }

    /**
     * 获取付款记录详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtPaymentRecordsService.selectWtPaymentRecordsById(id));
    }

    /**
     * 新增付款记录
     */
    @Log(title = "付款记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtPaymentRecords wtPaymentRecords)
    {
        return toAjax(wtPaymentRecordsService.insertWtPaymentRecords(wtPaymentRecords));
    }

    /**
     * 修改付款记录
     */
    @Log(title = "付款记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtPaymentRecords wtPaymentRecords)
    {
        return toAjax(wtPaymentRecordsService.updateWtPaymentRecords(wtPaymentRecords));
    }

    /**
     * 删除付款记录
     */
    @Log(title = "付款记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtPaymentRecordsService.deleteWtPaymentRecordsByIds(ids));
    }
}
