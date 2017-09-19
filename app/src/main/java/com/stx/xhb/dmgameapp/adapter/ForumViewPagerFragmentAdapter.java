package com.stx.xhb.dmgameapp.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.stx.core.base.BaseFragment;
import com.stx.xhb.dmgameapp.entity.ForumChannelListEntity;
import com.stx.xhb.dmgameapp.ui.fragment.ForumCommonFragment;

import java.util.List;

/**
 * Author: Mr.xiao on 2017/3/5
 *
 * @mail:xhb_199409@163.com
 * @github:https://github.com/xiaohaibin
 * @describe: 论坛ViewPager适配器
 */
public class ForumViewPagerFragmentAdapter extends FragmentPagerAdapter {
    private List<ForumChannelListEntity.HtmlEntity> mNewsTagList;

    public ForumViewPagerFragmentAdapter(FragmentManager fm, List<ForumChannelListEntity.HtmlEntity> newsTagList) {
        super(fm);
        this.mNewsTagList = newsTagList;
    }

    @Override
    public BaseFragment getItem(int position) {
        ForumChannelListEntity.HtmlEntity entity = mNewsTagList.get(position);
        return ForumCommonFragment.newInstance(entity.getFid());
    }

    @Override
    public int getCount() {
        return mNewsTagList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mNewsTagList.get(position % mNewsTagList.size()).getName();
    }

}
