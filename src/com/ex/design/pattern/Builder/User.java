package com.ex.design.pattern.Builder;

public class User {

    // create private variable which can be final in nature
    private int userId;
    private String userName;
    private String address;

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.address = userBuilder.address;
    }

    static class UserBuilder{
        private int userId;
        private String userName;
        private String address;

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
