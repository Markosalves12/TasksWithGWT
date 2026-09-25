package com.mycompany.mywebapp.ui.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainLayout_MainLayoutUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenBundle {
  private static MainLayout_MainLayoutUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MainLayout_MainLayoutUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenCss_style() {
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
        return (".com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-shell {\n  display : " + ("flex")  + ";\n  min-height : " + ("100vh")  + ";\n  background : " + ("#f3f5f9")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-sidebar {\n  width : " + ("240px")  + ";\n  background : " + ("#16386b")  + ";\n  color : " + ("#e8eefb")  + ";\n  padding : " + ("20px"+ " " +"14px")  + ";\n  display : " + ("flex")  + ";\n  flex-direction : " + ("column")  + ";\n  gap : " + ("22px")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-brand {\n  display : ") + (("flex")  + ";\n  align-items : " + ("center")  + ";\n  gap : " + ("10px")  + ";\n  font-size : " + ("17px")  + ";\n  font-weight : " + ("600")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-brandMark {\n  width : " + ("30px")  + ";\n  height : " + ("30px")  + ";\n  border-radius : " + ("8px")  + ";\n  background : " + ("#2f5da8")  + ";\n  display : " + ("inline-flex")  + ";\n  align-items : " + ("center") ) + (";\n  justify-content : " + ("center")  + ";\n  font-size : " + ("13px")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-nav {\n  display : " + ("flex")  + ";\n  flex-direction : " + ("column")  + ";\n  gap : " + ("2px")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-main {\n  flex : " + ("1")  + ";\n  display : " + ("flex")  + ";\n  flex-direction : " + ("column")  + ";\n  min-width : " + ("0")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-topbar {\n  height : " + ("68px")  + ";\n  background : ") + (("#fff")  + ";\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#e2e6ee")  + ";\n  display : " + ("flex")  + ";\n  align-items : " + ("center")  + ";\n  justify-content : " + ("space-between")  + ";\n  padding : " + ("0"+ " " +"26px")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-pageTitle {\n  font-size : " + ("18px")  + ";\n  font-weight : " + ("600")  + ";\n  color : " + ("#0f172a")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-breadcrumb {\n  font-size : " + ("12px")  + ";\n  color : " + ("#6b7692") ) + (";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-primaryButton {\n  background : " + ("#16386b")  + ";\n  color : " + ("#fff")  + ";\n  border : " + ("0")  + ";\n  border-radius : " + ("8px")  + ";\n  padding : " + ("9px"+ " " +"16px")  + ";\n  font-size : " + ("14px")  + ";\n  cursor : " + ("pointer")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-primaryButton:hover {\n  background : " + ("#1d4a8c")  + ";\n}\n.com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-content {\n  padding : " + ("26px")  + ";\n  flex : " + ("1")  + ";\n}\n");
      }
      public java.lang.String brand() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-brand";
      }
      public java.lang.String brandMark() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-brandMark";
      }
      public java.lang.String breadcrumb() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-breadcrumb";
      }
      public java.lang.String content() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-content";
      }
      public java.lang.String main() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-main";
      }
      public java.lang.String nav() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-nav";
      }
      public java.lang.String pageTitle() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-pageTitle";
      }
      public java.lang.String primaryButton() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-primaryButton";
      }
      public java.lang.String shell() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-shell";
      }
      public java.lang.String sidebar() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-sidebar";
      }
      public java.lang.String topbar() {
        return "com-mycompany-mywebapp-ui-layout-MainLayout_MainLayoutUiBinderImpl_GenCss_style-topbar";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.mycompany.mywebapp.ui.layout.MainLayout_MainLayoutUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
