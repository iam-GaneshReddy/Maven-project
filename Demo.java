package com.scaleupindia;
import java.util.List;

import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.service.Service;
import com.scaleupindia.service.impl.ServiceImpl;

public class Demo {
	private Service ownerService;

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.run(args);
	}

	public void run(String... args) {
		ownerService = new ServiceImpl();
		try {
			System.out.println("Welcome to Petistaan");
			List<OwnerDTO> ownerDTOList = ownerService.findAllOwners();
			System.out.println("There are " + ownerDTOList.size() + " owners.");
			ownerDTOList.forEach(System.out::println);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	
}
