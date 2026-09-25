package com.mycompany.mywebapp.ui.dashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DashboardView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenBundle {
  private static DashboardView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DashboardView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-cards {\n  display : " + ("flex")  + ";\n  flex-wrap : " + ("wrap")  + ";\n  gap : " + ("14px")  + ";\n  margin-bottom : " + ("18px")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-panel {\n  background : " + ("#fff")  + ";\n  border : " + ("1px"+ " " +"solid"+ " " +"#e2e6ee")  + ";\n  border-radius : " + ("12px")  + ";\n  padding : " + ("18px"+ " " +"20px")  + ";\n  margin-bottom : " + ("16px")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-panelTitle {\n  margin : " + ("0"+ " " +"0"+ " " +"12px")  + ";\n  font-size : ") + (("15px")  + ";\n  color : " + ("#0f172a")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressTrack {\n  height : " + ("10px")  + ";\n  background : " + ("#eef1f7")  + ";\n  border-radius : " + ("99px")  + ";\n  overflow : " + ("hidden")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressBar {\n  height : " + ("100%")  + ";\n  width : " + ("0")  + ";\n  background : " + ("#16386b")  + ";\n  transition : " + ("width"+ " " +"0.3s"+ " " +"ease")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressLabel {\n  font-size : " + ("12px") ) + (";\n  color : " + ("#6b7692")  + ";\n  margin-top : " + ("8px")  + ";\n  display : " + ("block")  + ";\n}\n.com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-activity {\n  display : " + ("flex")  + ";\n  flex-direction : " + ("column")  + ";\n  gap : " + ("10px")  + ";\n  font-size : " + ("14px")  + ";\n  color : " + ("#3c4761")  + ";\n}\n");
      }
      public java.lang.String activity() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-activity";
      }
      public java.lang.String cards() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-cards";
      }
      public java.lang.String panel() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-panel";
      }
      public java.lang.String panelTitle() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-panelTitle";
      }
      public java.lang.String progressBar() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressBar";
      }
      public java.lang.String progressLabel() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressLabel";
      }
      public java.lang.String progressTrack() {
        return "com-mycompany-mywebapp-ui-dashboard-DashboardView_BinderImpl_GenCss_style-progressTrack";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.mycompany.mywebapp.ui.dashboard.DashboardView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
