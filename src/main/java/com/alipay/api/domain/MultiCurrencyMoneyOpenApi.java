package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财务域多币种金额
 *
 * @author auto create
 * @since 1.0, 2020-08-18 11:34:01
 */
public class MultiCurrencyMoneyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 8523129124372474462L;

	/**
	 * 分
	 */
	@ApiField("cent")
	private Long cent;

	/**
	 * 币种类型值
	 */
	@ApiField("currency_value")
	private String currencyValue;

	public Long getCent() {
		return this.cent;
	}
	public void setCent(Long cent) {
		this.cent = cent;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

}
