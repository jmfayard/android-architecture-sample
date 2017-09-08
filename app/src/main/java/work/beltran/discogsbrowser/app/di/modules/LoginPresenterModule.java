package work.beltran.discogsbrowser.app.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import work.beltran.discogsbrowser.api.LoginService;
import work.beltran.discogsbrowser.business.LoginInteractor;
import work.beltran.discogsbrowser.business.RxJavaSchedulers;
import work.beltran.discogsbrowser.business.login.LoginInteractorImpl;
import work.beltran.discogsbrowser.app.settings.Settings;

/**
 * Created by miquel on 8/27/16.
 */
@Module(includes = {
        LoginModule.class,
        SettingsModule.class,
        RxJavaSchedulersModule.class
})
public class LoginPresenterModule {

}
