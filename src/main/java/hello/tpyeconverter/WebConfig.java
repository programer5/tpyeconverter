package hello.tpyeconverter;

import hello.tpyeconverter.converter.IntegerToStringConverter;
import hello.tpyeconverter.converter.IpPortToStringConverter;
import hello.tpyeconverter.converter.StringToIntegerConverter;
import hello.tpyeconverter.converter.StringToIpPortConverter;
import hello.tpyeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //주석처리 우선순위
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());
        //추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
