package com.HuangsHotelReservation.model.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.HuangsHotelReservation.model.service.calendarservice.CalendarServiceImplTest;
import com.HuangsHotelReservation.model.service.factory.ServiceFactoryTest;
import com.HuangsHotelReservation.model.service.seeGalleryService.seeGalleryServiceImplTest;
import com.HuangsHotelReservation.model.services.seeGalleryService.seeGalleryServiceImpl;

@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class,CalendarServiceImplTest.class,
	seeGalleryServiceImplTest.class})
public class AllTests {

}
