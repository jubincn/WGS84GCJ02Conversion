package cn.com.dist.geo.converter.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.com.dist.geo.converter.WgsGcjConverter;
import cn.com.dist.geo.converter.pojo.SimpleCoodinates;

public class GcjAndWgsTest {

    @Test
    public void test() {
        SimpleCoodinates gcjCoords = WgsGcjConverter.wgs84ToGcj02(39.90105, 116.42079);
      
        assertEquals(gcjCoords.getLat(), 39.90245, 1e-5);
        assertEquals(gcjCoords.getLon(), 116.42703, 1e-5);
        
        SimpleCoodinates wgsCoords = WgsGcjConverter.gcj02ToWgs84(39.90245, 116.42703);
        System.out.println(gcjCoords.getLat() + " ," + gcjCoords.getLon());
        assertEquals(wgsCoords.getLat(), 39.90105, 1e-5);
        assertEquals(wgsCoords.getLon(), 116.42079, 1e-5);
    }

}
