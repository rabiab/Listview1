package com.example.hp.assignment1;

/**
 * Created by HP on 10/2/2017.
 */
public class Contact {
private String name;
private String phone;


        public Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }



        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +

                    '}';
        }

}
