package solid.ren.themeskinning;

import com.squareup.leakcanary.LeakCanary;

import solid.ren.skinlibrary.SkinConfig;
import solid.ren.skinlibrary.base.SkinBaseApplication;
import solid.ren.themeskinning.custom_attr.RadioButtonAttr;
import solid.ren.themeskinning.custom_attr.TabLayoutIndicatorAttr;

/**
 * Created by _SOLID
 * Date:2016/7/5
 * Time:10:06
 */
public class App extends SkinBaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinConfig.setCanChangeStatusColor(true);
        SkinConfig.setCanChangeFont(true);
        SkinConfig.setDebug(true);
        SkinConfig.addSupportAttr("tabLayoutIndicator", new TabLayoutIndicatorAttr());
        SkinConfig.addSupportAttr("button", new RadioButtonAttr());

//        SkinConfig.enableGlobalSkinApply();

        LeakCanary.install(this);
    }
}
