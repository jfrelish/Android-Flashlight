
<?xml version="1.0" encoding="utf-8"?>

<manifest xmlns:android="http://schemas.android.com/apk/res/android"

    package="com.survivingwithandroid.torch">



    <uses-permission android:name="com.android.vending.BILLING" />

    <uses-permission android:name="android.permission.CAMERA"/>

    

    <uses-feature android:name="android.hardware.camera"/>

    

    <application

        android:allowBackup="true"

        android:icon="@drawable/ic_launcher"

        android:label="@string/app_name"

        android:theme="@style/AppTheme"

        android:debuggable="false">

        <activity

            android:name="com.survivingwithandroid.torch.MainActivity"

            android:label="@string/app_name" >

            <intent-filter>

                <action android:name="android.intent.action.MAIN" />



                <category android:name="android.intent.category.LAUNCHER" />

            </intent-filter>

        </activity>

    </application>



</manifest>
