package com.lzh.mvc;


import com.lzh.mvc.entity.SysAdmin;
import com.lzh.mvc.mapper.SysAdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Test
    public void test() {
        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.setId(1);
        sysAdmin.setUsername("123");
        sysAdminMapper.insert(sysAdmin);
    }
}
