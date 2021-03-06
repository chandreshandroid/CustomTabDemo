# CustomTabDemo Demo
<b>Implementation guide</b>

First thing to do, is to add the chrome custom tabs dependency to the dependencies section of your app-level build.gradle file. The section should look like this

dependencies
{  
    ...
    <br/>
       compile 'com.android.support:customtabs:25.2.0'
       <br/>
}

now setup <b>CustomTabsIntent builder</b> for open web url in custom tab.

       String url = "http://www.enggroom.com";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        
      // set toolbar color and/or setting custom actions before invoking build()
        builder.setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        builder.setSecondaryToolbarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        builder.setShowTitle(true);
        
         // Application exit animation, Chrome enter animation.
        builder.setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left);
        
      // vice versa
        builder.setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right);
        
        CustomTabsIntent customTabsIntent = builder.build();
        
       // and launch the desired Url with CustomTabsIntent.launchUrl()
         customTabsIntent.launchUrl(this, Uri.parse(url));
         

 <p align="center">
  <img src="../master/image/1.png" width="350"/>
  <img src="../master/image/2.png" width="350"/>
</p>

<a href="https://developer.chrome.com/multidevice/android/customtabs">for more deatils of Custom TAB</a> 

 
 
