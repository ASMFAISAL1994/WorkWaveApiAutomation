package Repository.RemoteRepo.responseRepo;

import java.io.Serializable;

public class WorkWavePostLoginResponseModel {

    /**
     * status : true
     * message : Login successfully
     * code : 200
     * data : {"token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG5kaWdpbmV0LmltcmFuQGdtYWlsLmNvbSIsImlhdCI6MTcwMTY2ODc2NywiZXhwIjoxNzAxNjcyMzY3fQ.nENvSQ9bNaGYX3Fl0M40phcjuzfD0YNOm03YHUDmlOQ","refreshToken":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG5kaWdpbmV0LmltcmFuQGdtYWlsLmNvbSIsImlhdCI6MTcwMTY2ODc2NywiZXhwIjoxNzAxNzU1MTY3fQ.tVOhR3B-g45zVMa253ORGPtVyxt7-ZH2WXtRY2XjqNE","expiredAt":"2023-12-04 12:46:07","user":{"id":1,"email":"adndiginet.imran@gmail.com","mobile":"+8801677078718","designation":"Software Engineer","department":"Technology","company":{"id":1,"name":"ADN DigiNet Ltd","address":"Gulshan-1"},"active":true}}
     */

    private boolean status;
    private String message;
    private int code;
    private DataBean data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * token : eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG5kaWdpbmV0LmltcmFuQGdtYWlsLmNvbSIsImlhdCI6MTcwMTY2ODc2NywiZXhwIjoxNzAxNjcyMzY3fQ.nENvSQ9bNaGYX3Fl0M40phcjuzfD0YNOm03YHUDmlOQ
         * refreshToken : eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG5kaWdpbmV0LmltcmFuQGdtYWlsLmNvbSIsImlhdCI6MTcwMTY2ODc2NywiZXhwIjoxNzAxNzU1MTY3fQ.tVOhR3B-g45zVMa253ORGPtVyxt7-ZH2WXtRY2XjqNE
         * expiredAt : 2023-12-04 12:46:07
         * user : {"id":1,"email":"adndiginet.imran@gmail.com","mobile":"+8801677078718","designation":"Software Engineer","department":"Technology","company":{"id":1,"name":"ADN DigiNet Ltd","address":"Gulshan-1"},"active":true}
         */

        private String token;
        private String refreshToken;
        private String expiredAt;
        private UserBean user;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public String getExpiredAt() {
            return expiredAt;
        }

        public void setExpiredAt(String expiredAt) {
            this.expiredAt = expiredAt;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean implements Serializable {
            /**
             * id : 1
             * email : adndiginet.imran@gmail.com
             * mobile : +8801677078718
             * designation : Software Engineer
             * department : Technology
             * company : {"id":1,"name":"ADN DigiNet Ltd","address":"Gulshan-1"}
             * active : true
             */

            private int id;
            private String email;
            private String mobile;
            private String designation;
            private String department;
            private CompanyBean company;
            private boolean active;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getDesignation() {
                return designation;
            }

            public void setDesignation(String designation) {
                this.designation = designation;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public CompanyBean getCompany() {
                return company;
            }

            public void setCompany(CompanyBean company) {
                this.company = company;
            }

            public boolean isActive() {
                return active;
            }

            public void setActive(boolean active) {
                this.active = active;
            }

            public static class CompanyBean implements Serializable {
                /**
                 * id : 1
                 * name : ADN DigiNet Ltd
                 * address : Gulshan-1
                 */

                private int id;
                private String name;
                private String address;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }
            }
        }
    }
}
