package com.binance.client.model.enums;
/*
	* GTC (Good-Till-Cancel): the order will last until it is completed or you cancel it.
	
	* IOC (Immediate-Or-Cancel): the order will attempt to execute all or part of it immediately at the price and quantity available, then cancel any remaining, unfilled part of the order. If no quantity is available at the chosen price when you place the order, it will be canceled immediately. Please note that Iceberg orders are not supported.
	
	* * FOK (Fill-Or-Kill): the order is instructed to execute in full immediately (filled), otherwise it will be canceled (killed). Please note that Iceberg orders are not supported.
 */
public enum  TimeInForce {
    GTC,
    IOC,
    FOK
}
