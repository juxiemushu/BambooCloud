package com.bamboo.common.converter;

import com.bamboo.common.converter.stream.ConverterStream;

import java.util.function.Function;

/**
 * @author WuWei
 * @date 2021/11/3 9:02 下午
 */

@FunctionalInterface
public interface Converter<Source, Target> extends Function<Source, Target> {

    Target convert(Source source);

    @Override
    default Target apply(Source source) {
        return convert(source);
    }

    static <Source, Target> Target directConvert(Source source, Class<Target> targetClass) {
        if(source == null) {
            return null;
        }

        return ConverterStream.from(input).convert(outputClass).get();
    }

}
