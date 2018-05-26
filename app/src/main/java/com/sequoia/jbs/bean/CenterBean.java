package com.sequoia.jbs.bean;

/**
 * @author Administrator.
 * @date 2018/5/26.
 * @funtion
 */
public class CenterBean {


    /**
     * messgae : 成功
     * data : {"greeting":"上午好,测试2,大区代理,2018-05-26","nowuser":0,"position":{"address":"100","alias":"","createtime":"2018-05-24 08:49:03.0","createuserid":2,"createusername":"","customerCode":"","gradename":"大区代理","icard":"100","integeralnum":100,"latitude":"","longitude":"100","maxcreatetime":"","mincreatetime":"","nickname":"测试2","password":"C16E9D2EBF4B175C8236EE5424B80BCA","picture":"/images/737ef60f45ca4448a75453cd213ace9f.png","pid":1,"position":1,"shopname":"100","state":0,"stock":85,"username":"17091761170"},"alluser":0}
     * state : 0
     */

    private String messgae;
    private DataBean data;
    private int state;

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static class DataBean {
        /**
         * greeting : 上午好,测试2,大区代理,2018-05-26
         * nowuser : 0
         * position : {"address":"100","alias":"","createtime":"2018-05-24 08:49:03.0","createuserid":2,"createusername":"","customerCode":"","gradename":"大区代理","icard":"100","integeralnum":100,"latitude":"","longitude":"100","maxcreatetime":"","mincreatetime":"","nickname":"测试2","password":"C16E9D2EBF4B175C8236EE5424B80BCA","picture":"/images/737ef60f45ca4448a75453cd213ace9f.png","pid":1,"position":1,"shopname":"100","state":0,"stock":85,"username":"17091761170"}
         * alluser : 0
         */

        private String greeting;
        private int nowuser;
        private PositionBean position;
        private int alluser;

        public String getGreeting() {
            return greeting;
        }

        public void setGreeting(String greeting) {
            this.greeting = greeting;
        }

        public int getNowuser() {
            return nowuser;
        }

        public void setNowuser(int nowuser) {
            this.nowuser = nowuser;
        }

        public PositionBean getPosition() {
            return position;
        }

        public void setPosition(PositionBean position) {
            this.position = position;
        }

        public int getAlluser() {
            return alluser;
        }

        public void setAlluser(int alluser) {
            this.alluser = alluser;
        }

        public static class PositionBean {
            /**
             * address : 100
             * alias :
             * createtime : 2018-05-24 08:49:03.0
             * createuserid : 2
             * createusername :
             * customerCode :
             * gradename : 大区代理
             * icard : 100
             * integeralnum : 100
             * latitude :
             * longitude : 100
             * maxcreatetime :
             * mincreatetime :
             * nickname : 测试2
             * password : C16E9D2EBF4B175C8236EE5424B80BCA
             * picture : /images/737ef60f45ca4448a75453cd213ace9f.png
             * pid : 1
             * position : 1
             * shopname : 100
             * state : 0
             * stock : 85
             * username : 17091761170
             */

            private String address;
            private String alias;
            private String createtime;
            private int createuserid;
            private String createusername;
            private String customerCode;
            private String gradename;
            private String icard;
            private int integeralnum;
            private String latitude;
            private String longitude;
            private String maxcreatetime;
            private String mincreatetime;
            private String nickname;
            private String password;
            private String picture;
            private int pid;
            private int position;
            private String shopname;
            private int state;
            private int stock;
            private String username;

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public int getCreateuserid() {
                return createuserid;
            }

            public void setCreateuserid(int createuserid) {
                this.createuserid = createuserid;
            }

            public String getCreateusername() {
                return createusername;
            }

            public void setCreateusername(String createusername) {
                this.createusername = createusername;
            }

            public String getCustomerCode() {
                return customerCode;
            }

            public void setCustomerCode(String customerCode) {
                this.customerCode = customerCode;
            }

            public String getGradename() {
                return gradename;
            }

            public void setGradename(String gradename) {
                this.gradename = gradename;
            }

            public String getIcard() {
                return icard;
            }

            public void setIcard(String icard) {
                this.icard = icard;
            }

            public int getIntegeralnum() {
                return integeralnum;
            }

            public void setIntegeralnum(int integeralnum) {
                this.integeralnum = integeralnum;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getMaxcreatetime() {
                return maxcreatetime;
            }

            public void setMaxcreatetime(String maxcreatetime) {
                this.maxcreatetime = maxcreatetime;
            }

            public String getMincreatetime() {
                return mincreatetime;
            }

            public void setMincreatetime(String mincreatetime) {
                this.mincreatetime = mincreatetime;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public String getShopname() {
                return shopname;
            }

            public void setShopname(String shopname) {
                this.shopname = shopname;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }
    }
}
