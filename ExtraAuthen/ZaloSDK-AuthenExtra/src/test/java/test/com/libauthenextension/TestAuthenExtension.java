package test.com.libauthenextension;

import android.app.Activity;

import com.zing.zalo.zalosdk.oauth.AuthenticateExtention;
import com.zing.zalo.zalosdk.oauth.OAuthCompleteListener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by CPU10329-local on 7/4/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class TestAuthenExtension {

    @Mock
    Activity activityMock;

    @Test
    public void testLoginFacebook(){
//        AuthenticateExtention authenticateExtention = new AuthenticateExtention();
//        authenticateExtention.authenticateWithFacebook(activityMock, new OAuthCompleteListener());
    }
}
