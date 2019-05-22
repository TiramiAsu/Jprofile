/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseiii_orm;

import org.hibernate.cfg.Configuration;

/**
 *
 * @author USER
 */
public class TestConfig {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        System.out.println(cfg.configure().getProperty("hibernate.connection.datasource"));
        System.out.println(cfg.configure().getProperty("hibernate.dialect"));
        System.out.println(cfg.configure().getProperty("current_session_context_class"));
        System.out.println(cfg.configure().getProperty("cache.provider_class"));
        System.out.println(cfg.configure().getProperty("show_sql"));
    }

}
