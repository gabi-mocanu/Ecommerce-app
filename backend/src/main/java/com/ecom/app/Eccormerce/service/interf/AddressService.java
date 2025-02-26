package com.ecom.app.Eccormerce.service.interf;

import com.ecom.app.Eccormerce.dto.AddressDto;
import com.ecom.app.Eccormerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
