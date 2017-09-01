package com.mk.spring.jdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mk.spring.jdbc.model.CatEventMessage;

public class EventDaoImpl implements EventDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createCatEvent(CatEventMessage event) {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlQuery = "Insert into cat_event_message (EVENT_MESSAGE_ID,EVENT_PRIORITY,EVENT_TYPE_CODE,EVENT_CORRELATION_AN,EVENT_TOPIC_KEY,IS_SENT,CREATE_TM,LAST_UPDATE_TM,LAST_UPDATE_USER_AN,PROCESS_STATUS_ID,EVENT_NOTIFY_STATUS_C) "
				+ "values (6680880,null,'VESSEL_UPDATE','LUIS1701','VESSEL_UPDATE',0,to_timestamp(sysdate,'DD-MON-RR HH.MI.SSXFF AM'),to_timestamp(sysdate,'DD-MON-RR HH.MI.SSXFF AM'),'SYSTEM',null,null)";

		jdbcTemplate.update(sqlQuery);
		
		System.out.println("Event Inserted into CatEventMessage Table Successfully");
	}

}
