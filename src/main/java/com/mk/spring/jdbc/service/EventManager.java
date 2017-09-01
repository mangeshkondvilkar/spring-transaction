package com.mk.spring.jdbc.service;

import com.mk.spring.jdbc.model.CatEventMessage;

public interface EventManager {

	public void createCatEvent(CatEventMessage event);
}
