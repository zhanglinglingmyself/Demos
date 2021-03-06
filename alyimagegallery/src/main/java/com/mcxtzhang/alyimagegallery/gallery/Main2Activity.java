package com.mcxtzhang.alyimagegallery.gallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mcxtzhang.alyimagegallery.R;
import com.mcxtzhang.alyimagegallery.gallery.view.AlyGallery;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AlyGallery alyBaseGallery = (AlyGallery) findViewById(R.id.gallery);
        alyBaseGallery.setDatas(initDatas());
    }

    public List<String> initDatas() {
        List<String> datas = new ArrayList<>();
        datas.add(new String("http://pic.imcoming.cn/59bace70e68c4107b6b3ba421d97d29c_1920x1080.jpg"));
        datas.add(new String("http://p14.go007.com/2014_11_02_05/a03541088cce31b8_1.jpg"));
        datas.add(new String("http://news.k618.cn/tech/201604/W020160407281077548026.jpg"));
        datas.add(new String("http://www.kejik.com/image/1460343965520.jpg"));
        datas.add(new String("http://cn.chinadaily.com.cn/img/attachement/jpg/site1/20160318/eca86bd77be61855f1b81c.jpg"));
        datas.add(new String("http://imgs.ebrun.com/resources/2016_04/2016_04_12/201604124411460430531500.jpg"));
        datas.add(new String("http://imgs.ebrun.com/resources/2016_04/2016_04_24/201604244971461460826484_origin.jpeg"));
        datas.add(new String("http://www.lnmoto.cn/bbs/data/attachment/forum/201408/12/074018gshshia3is1cw3sg.jpg"));
        return datas;
    }
}
