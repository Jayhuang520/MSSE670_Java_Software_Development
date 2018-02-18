package com.huangshotelreservation.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.huangshotelreservation.model.service.calendarservice.CalendarServiceImplTest;
import com.huangshotelreservation.model.service.factory.ServiceFactoryTest;
import com.huangshotelreservation.model.service.seeGalleryService.seeGalleryServiceImplTest;

@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class,CalendarServiceImplTest.class,
	seeGalleryServiceImplTest.class})
public class AllServiceTests {

}
