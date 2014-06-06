Android KCFlip
============================
###如何引用此组件：
已经独立成maven项目，mvn install之后可以在项目maven添加以下依赖引用：

```
<dependency>
  <groupId>com.github.destinyd</groupId>
  <artifactId>kcflip</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <type>apklib</type>
</dependency>
```

###需求所需要方法说明
```
public void set_brief_view(View view);
public void set_detail_view(View view);
```
这两个方法用来设置摘要和详细视图

```
public void to_brief();
public void to_detail();
```
当调用这两个方法时，分别以翻页动画切换到摘要视图和详细视图。

###注意事项
使用时必须重写Activity的onResume和onPause事件
```
@Override
protected void onResume() {
  super.onResume();
  kcFlip.onResume();
}

@Override
protected void onPause() {
  super.onPause();
  kcFlip.onPause();
}
```
