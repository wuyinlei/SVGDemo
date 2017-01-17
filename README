# 在安卓中使用iconfont图标
标签（空格分隔）： 未分类

---
1、从iconfont平台选择你需要用到的图标，并下载到本地，复制字体文件到项目asset目录下。
![](http://ww2.sinaimg.cn/mw690/006jcGvzgw1fbtnjtfx4uj30pq0bmtal.jpg)
2、打开下载下来的文件，并在目录中打开demo_unicode.html，找到图标相对应的HTML实体字符码
![](http://ww4.sinaimg.cn/mw690/006jcGvzgw1fbtnhecpfgj30tg0dqt9i.jpg)
3、打开res/valuse/string.xml，添加string值(确保和上面的图片中的一致)
```
 <string name="icon_like_normal">&#xe643;</string>
    <string name="icon_like_selected">&#xe684;</string>
```
4、布局中直接使用(textSize用于改变大小)
```
<TextView
        android:id="@+id/text"
        android:layout_width="wrap_content"
        android:textSize="24dp"
        android:layout_height="wrap_content"
        android:text="@string/icon_like_normal"/>
```
5、代码中使用
```

        //创建Typeface    给入第一步的字体路径
        Typeface typeface =Typeface.createFromAsset(getAssets(),"iconfont.ttf");

        mTextView.setTypeface(typeface);

        /**
         * 用于模拟收藏和未收藏  逻辑
         */
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSelected) {  //未收藏
                    isSelected = true;
                    Toast.makeText(MainActivity.this, "我已经收藏了", Toast.LENGTH_SHORT).show();
                    mTextView.setText(getResources().getString(R.string.icon_like_selected));
                } else {
                    isSelected = false;
                    Toast.makeText(MainActivity.this, "我已经取消收藏了", Toast.LENGTH_SHORT).show();
                    mTextView.setText(getResources().getString(R.string.icon_like_normal));
                }
            }
        });
```
6、看下效果
![](http://ww3.sinaimg.cn/mw690/006jcGvzgw1fbtnqnnnbng30750963yi.gif)



