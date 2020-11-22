package br.com.krakatoa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"br.com.krakatoa.base", "br.com.krakatoa.platform", "br.com.krakatoa.page.actions"})
public class AppConfig {


}
