package com.duke.controller;

import javax.ejb.Stateless;

@Stateless
public class TranscoController {
	public String GetOneStringFromPredicate(String predicate){
		return predicate + System.currentTimeMillis();
	}
}
