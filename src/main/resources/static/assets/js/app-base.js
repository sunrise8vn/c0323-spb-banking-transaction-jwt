class AppBase {
  static DOMAIN_SERVER = location.origin;
  static API_SERVER = this.DOMAIN_SERVER + '/api';
  static API_CUSTOMER = this.API_SERVER + '/customers';

  static BASE_URL_CLOUD_IMAGE = "https://res.cloudinary.com/dev-share/image/upload";
  static BASE_SCALE_IMAGE = "c_limit,w_50,h_50,q_100";

  static BASE_SCALE_IMAGE_300_250_100 = "c_limit,w_300,h_250,q_100";
}

class LocationRegion {
  constructor(
    id,
    provinceId,
    provinceName,
    districtId,
    districtName,
    wardId,
    wardName,
    address
  ) {
    this.id = id;
    this.provinceId = provinceId;
    this.provinceName = provinceName;
    this.districtId = districtId;
    this.districtName = districtName;
    this.wardId = wardId;
    this.wardName = wardName;
    this.address = address;
  }
}

class Customer {
  constructor(id, fullName, email, phone, locationRegion, balance, deleted) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.phone = phone;
    this.locationRegion = locationRegion;
    this.balance = balance;
    this.deleted = deleted;
  }
}
