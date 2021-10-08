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
import com.ruoyi.business.domain.WtStartRegistration;
import com.ruoyi.business.service.IWtStartRegistrationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 开工登记Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/registration")
public class WtStartRegistrationController extends BaseController
{
    @Autowired
    private IWtStartRegistrationService wtStartRegistrationService;

    /**
     * 查询开工登记列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtStartRegistration wtStartRegistration)
    {
        startPage();
        List<WtStartRegistration> list = wtStartRegistrationService.selectWtStartRegistrationList(wtStartRegistration);
        return getDataTable(list);
    }

    /**
     * 导出开工登记列表
     */
    @Log(title = "开工登记", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtStartRegistration wtStartRegistration)
    {
        List<WtStartRegistration> list = wtStartRegistrationService.selectWtStartRegistrationList(wtStartRegistration);
        ExcelUtil<WtStartRegistration> util = new ExcelUtil<WtStartRegistration>(WtStartRegistration.class);
        return util.exportExcel(list, "开工登记数据");
    }

    /**
     * 获取开工登记详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtStartRegistrationService.selectWtStartRegistrationById(id));
    }

    /**
     * 新增开工登记
     */
    @Log(title = "开工登记", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtStartRegistration wtStartRegistration)
    {
        return toAjax(wtStartRegistrationService.insertWtStartRegistration(wtStartRegistration));
    }

    /**
     * 修改开工登记
     */
    @Log(title = "开工登记", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtStartRegistration wtStartRegistration)
    {
        return toAjax(wtStartRegistrationService.updateWtStartRegistration(wtStartRegistration));
    }

    /**
     * 删除开工登记
     */
    @Log(title = "开工登记", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtStartRegistrationService.deleteWtStartRegistrationByIds(ids));
    }
}
