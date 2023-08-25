package com.cg.model.dto;


import com.cg.model.Customer;
import com.cg.model.CustomerAvatar;
import com.cg.model.Deposit;
import com.cg.model.LocationRegion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CustomerCreateReqDTO {
    private String fullName;
    private String email;
    private String phone;

    private String provinceId;
    private String provinceName;
    private String districtId;
    private String districtName;
    private String wardId;
    private String wardName;
    private String address;

    private MultipartFile avatar;

    public LocationRegion toLocationRegion() {
        return new LocationRegion()
                .setProvinceId(provinceId)
                .setProvinceName(provinceName)
                .setDistrictId(districtId)
                .setDistrictName(districtName)
                .setWardId(wardId)
                .setWardName(wardName)
                .setAddress(address)
                ;
    }

    public Customer toCustomer() {
        return new Customer()
                .setFullName(fullName)
                .setEmail(email)
                .setPhone(phone)
                ;
    }
}
