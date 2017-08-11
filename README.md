# CustomTabDemo Demo
#Implementation guide

First thing to do, is to add the chrome custom tabs dependency to the dependencies section of your app-level build.gradle file. The section should look like this

dependencies
{  
    ...
    <br/>
       compile 'com.android.support:customtabs:25.2.0'
}

now setup # CustomTabsIntent builder for open web url in custom tab.

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
 
