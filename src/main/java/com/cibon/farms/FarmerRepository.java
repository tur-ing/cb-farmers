package com.cibon.farms;

import org.springframework.data.repository.PagingAndSortingRepository;

//tag::code[]
public interface FarmerRepository extends PagingAndSortingRepository<Farmer, Long> {

}
//end::code[]
