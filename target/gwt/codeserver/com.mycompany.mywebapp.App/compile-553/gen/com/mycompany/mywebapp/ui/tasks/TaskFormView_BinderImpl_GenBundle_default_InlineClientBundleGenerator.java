package com.mycompany.mywebapp.ui.tasks;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TaskFormView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenBundle {
  private static TaskFormView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new TaskFormView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenCss_style() {
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
        return (".com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-panel {\n  background : " + ("#fff")  + ";\n  border : " + ("1px"+ " " +"solid"+ " " +"#e2e6ee")  + ";\n  border-radius : " + ("12px")  + ";\n  padding : " + ("22px"+ " " +"24px")  + ";\n  max-width : " + ("760px")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-grid {\n  display : " + ("flex")  + ";\n  flex-wrap : " + ("wrap")  + ";\n  gap : " + ("16px")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-field {\n  display : " + ("flex")  + ";\n  flex-direction : " + ("column")  + ";\n  gap : ") + (("6px")  + ";\n  flex : " + ("1"+ " " +"1"+ " " +"240px")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-fieldWide {\n  flex : " + ("1"+ " " +"1"+ " " +"100%")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-label {\n  font-size : " + ("12px")  + ";\n  font-weight : " + ("600")  + ";\n  color : " + ("#3c4761")  + ";\n  text-transform : " + ("uppercase")  + ";\n  letter-spacing : " + ("0.05em")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-input, .com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-select {\n  border : " + ("1px"+ " " +"solid"+ " " +"#cbd3e1")  + ";\n  border-radius : " + ("8px")  + ";\n  padding : " + ("9px"+ " " +"11px") ) + (";\n  font-size : " + ("14px")  + ";\n  font-family : " + ("inherit")  + ";\n  width : " + ("100%")  + ";\n  box-sizing : " + ("border-box")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-textarea {\n  border : " + ("1px"+ " " +"solid"+ " " +"#cbd3e1")  + ";\n  border-radius : " + ("8px")  + ";\n  padding : " + ("9px"+ " " +"11px")  + ";\n  font-size : " + ("14px")  + ";\n  font-family : " + ("inherit")  + ";\n  width : " + ("100%")  + ";\n  box-sizing : ") + (("border-box")  + ";\n  min-height : " + ("96px")  + ";\n  resize : " + ("vertical")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-input:focus, .com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-select:focus, .com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-textarea:focus {\n  outline : " + ("2px"+ " " +"solid"+ " " +"#16386b")  + ";\n  border-color : " + ("#16386b")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-actions {\n  display : " + ("flex")  + ";\n  gap : " + ("10px")  + ";\n  margin-top : " + ("22px")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-save {\n  background : " + ("#16386b")  + ";\n  color : " + ("#fff")  + ";\n  border : " + ("0") ) + (";\n  border-radius : " + ("8px")  + ";\n  padding : " + ("10px"+ " " +"20px")  + ";\n  cursor : " + ("pointer")  + ";\n}\n.com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-cancel {\n  background : " + ("#fff")  + ";\n  color : " + ("#3c4761")  + ";\n  border : " + ("1px"+ " " +"solid"+ " " +"#cbd3e1")  + ";\n  border-radius : " + ("8px")  + ";\n  padding : " + ("10px"+ " " +"20px")  + ";\n  cursor : " + ("pointer")  + ";\n}\n");
      }
      public java.lang.String actions() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-actions";
      }
      public java.lang.String cancel() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-cancel";
      }
      public java.lang.String field() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-field";
      }
      public java.lang.String fieldWide() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-fieldWide";
      }
      public java.lang.String grid() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-grid";
      }
      public java.lang.String input() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-input";
      }
      public java.lang.String label() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-label";
      }
      public java.lang.String panel() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-panel";
      }
      public java.lang.String save() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-save";
      }
      public java.lang.String select() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-select";
      }
      public java.lang.String textarea() {
        return "com-mycompany-mywebapp-ui-tasks-TaskFormView_BinderImpl_GenCss_style-textarea";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.mycompany.mywebapp.ui.tasks.TaskFormView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
