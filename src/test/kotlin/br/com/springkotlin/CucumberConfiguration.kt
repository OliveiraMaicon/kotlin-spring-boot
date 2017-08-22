package br.com.springkotlin

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Created by maiconoliveira on 21/08/17.
 */
@Configuration
@ComponentScan(basePackages = arrayOf("br.com.springkotlin"))
class CucumberConfiguration{

}