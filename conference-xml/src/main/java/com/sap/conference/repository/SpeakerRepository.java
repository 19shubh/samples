package com.sap.conference.repository;

import java.util.List;

import com.sap.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}