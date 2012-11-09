package mddProject.concreteSyntax.generator;

import java.util.ArrayList;
import jdsl.AccessLevelEnum;
import jdsl.CMS;
import jdsl.CMSEnum;
import jdsl.ContentModel;
import jdsl.ContentType;
import jdsl.NamedElement;
import jdsl.Property;
import jdsl.TypeEnum;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JDSLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final ContentModel model = ((ContentModel) _head);
    ArrayList<CMS> _arrayList = new ArrayList<CMS>();
    ArrayList<CMS> cmsList = _arrayList;
    ArrayList<ContentType> _arrayList_1 = new ArrayList<ContentType>();
    ArrayList<ContentType> contentList = _arrayList_1;
    EList<NamedElement> _hasElements = model.getHasElements();
    boolean _isEmpty = _hasElements.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<NamedElement> _hasElements_1 = model.getHasElements();
      for (final NamedElement c : _hasElements_1) {
        try {
          boolean _matched = false;
          if (!_matched) {
            if (c instanceof CMS) {
              final CMS _cMS = (CMS)c;
              _matched=true;
              cmsList.add(((CMS) _cMS));
            }
          }
          if (!_matched) {
            if (c instanceof ContentType) {
              final ContentType _contentType = (ContentType)c;
              _matched=true;
              contentList.add(((ContentType) _contentType));
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      for (final CMS cms : cmsList) {
        for (final ContentType ct : contentList) {
          CMSEnum _type = cms.getType();
          final CMSEnum _switchValue = _type;
          boolean _matched_1 = false;
          if (!_matched_1) {
            CMSEnum _type_1 = cms.getType();
            String _string = _type_1.toString();
            boolean _equals = _string.equals("Jease");
            if (_equals) {
              _matched_1=true;
              this.toJease(ct, fsa);
            }
          }
          if (!_matched_1) {
            CMSEnum _type_2 = cms.getType();
            String _string_1 = _type_2.toString();
            boolean _equals_1 = _string_1.equals("N2");
            if (_equals_1) {
              _matched_1=true;
              this.toN2Class(ct, fsa);
            }
          }
          if (!_matched_1) {
            CMSEnum _type_3 = cms.getType();
            String _string_2 = _type_3.toString();
            boolean _equals_2 = _string_2.equals("Concrete5");
            if (_equals_2) {
              _matched_1=true;
              this.toConcrete5(ct, fsa);
            }
          }
          if (!_matched_1) {
            CMSEnum _type_4 = cms.getType();
            String _string_3 = _type_4.toString();
            boolean _equals_3 = _string_3.equals("Plone");
            if (_equals_3) {
              _matched_1=true;
              this.toPlone(ct, fsa);
            }
          }
        }
      }
    }
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public void toJease(final ContentType ct, final IFileSystemAccess fsa) {
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + ".java");
    CharSequence _jeaseDomainClass = this.toJeaseDomainClass(ct);
    fsa.generateFile(_plus, _jeaseDomainClass);
    String _name_1 = ct.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus_1 = (_firstUpper_1 + "Editor");
    String _plus_2 = (_plus_1 + ".java");
    CharSequence _jeaseEditorClass = this.toJeaseEditorClass(ct);
    fsa.generateFile(_plus_2, _jeaseEditorClass);
    String _name_2 = ct.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    String _plus_3 = (_firstUpper_2 + ".jsp");
    CharSequence _jeaseJSP = this.toJeaseJSP(ct);
    fsa.generateFile(_plus_3, _jeaseJSP);
    String _name_3 = ct.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
    String _plus_4 = (_firstUpper_3 + ".xml");
    CharSequence _jeaseXML = this.toJeaseXML(ct);
    fsa.generateFile(_plus_4, _jeaseXML);
  }
  
  public CharSequence toJeaseDomainClass(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import jease.cms.domain.Content;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(" extends Content {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        CharSequence _jeasePropertyField = this.toJeasePropertyField(p);
        _builder.append(_jeasePropertyField, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Property> _hasProperties_1 = ct.getHasProperties();
      for(final Property p_1 : _hasProperties_1) {
        CharSequence _jeaseProperty = this.toJeaseProperty(p_1);
        _builder.append(_jeaseProperty, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public StringBuilder getFulltext() {");
    _builder.newLine();
    _builder.append("return super.getFulltext().append(\"\\n\")");
    _builder.newLine();
    {
      EList<Property> _hasProperties_2 = ct.getHasProperties();
      for(final Property p_2 : _hasProperties_2) {
        _builder.append("\t");
        _builder.append(".append(");
        String _name_1 = p_2.getName();
        String _lowerCase = _name_1.toLowerCase();
        _builder.append(_lowerCase, "	");
        _builder.append(").append(\"\\n\")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(".append(\"\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void replace(String target, String replacement) {");
    _builder.newLine();
    _builder.append("super.replace(target, replacement);");
    _builder.newLine();
    {
      EList<Property> _hasProperties_3 = ct.getHasProperties();
      for(final Property p_3 : _hasProperties_3) {
        CharSequence _switchResult = null;
        TypeEnum _type = p_3.getType();
        final TypeEnum _switchValue = _type;
        boolean _matched = false;
        if (!_matched) {
          TypeEnum _type_1 = p_3.getType();
          String _string = _type_1.toString();
          String _lowerCase_1 = _string.toLowerCase();
          boolean _equals = _lowerCase_1.equals("string");
          if (_equals) {
            _matched=true;
            CharSequence _insertStringReplacement = this.insertStringReplacement(p_3);
            _switchResult = _insertStringReplacement;
          }
        }
        _builder.append(_switchResult, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public ");
    String _name_2 = ct.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "");
    _builder.append(" copy(boolean recursive) {");
    _builder.newLineIfNotEmpty();
    String _name_3 = ct.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "");
    _builder.append(" ");
    String _name_4 = ct.getName();
    String _lowerCase_2 = _name_4.toLowerCase();
    _builder.append(_lowerCase_2, "");
    _builder.append(" = (");
    String _name_5 = ct.getName();
    String _string_1 = _name_5.toString();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_string_1);
    _builder.append(_firstUpper_3, "");
    _builder.append(")super.copy(recursive);");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _hasProperties_4 = ct.getHasProperties();
      for(final Property p_4 : _hasProperties_4) {
        _builder.append("\t");
        String _name_6 = ct.getName();
        String _lowerCase_3 = _name_6.toLowerCase();
        _builder.append(_lowerCase_3, "	");
        _builder.append(".set");
        String _name_7 = p_4.getName();
        String _string_2 = _name_7.toString();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_string_2);
        _builder.append(_firstUpper_4, "	");
        _builder.append("(get");
        String _name_8 = p_4.getName();
        String _string_3 = _name_8.toString();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_string_3);
        _builder.append(_firstUpper_5, "	");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("return ");
    String _name_9 = ct.getName();
    _builder.append(_name_9, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence insertStringReplacement(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("set");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(get");
    String _name_1 = p.getName();
    String _string = _name_1.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper_1, "");
    _builder.append("().replace(target, replacement));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toJeaseProperty(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    CharSequence _determineJeasePropertyType = this.determineJeasePropertyType(p);
    _builder.append(_determineJeasePropertyType, "");
    _builder.append(" get");
    String _name = p.getName();
    String _string = _name.toString();
    String _string_1 = _string.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("return ");
    String _name_1 = p.getName();
    String _string_2 = _name_1.toString();
    String _lowerCase = _string_2.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _name_2 = p.getName();
    String _string_3 = _name_2.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string_3);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    CharSequence _determineJeasePropertyType_1 = this.determineJeasePropertyType(p);
    _builder.append(_determineJeasePropertyType_1, "");
    _builder.append(" ");
    String _name_3 = p.getName();
    String _string_4 = _name_3.toString();
    String _lowerCase_1 = _string_4.toLowerCase();
    _builder.append(_lowerCase_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append(") {");
    _builder.newLine();
    _builder.append("this.");
    String _name_4 = p.getName();
    String _string_5 = _name_4.toString();
    String _lowerCase_2 = _string_5.toLowerCase();
    _builder.append(_lowerCase_2, "");
    _builder.append(" = ");
    String _name_5 = p.getName();
    String _string_6 = _name_5.toString();
    String _lowerCase_3 = _string_6.toLowerCase();
    _builder.append(_lowerCase_3, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJeasePropertyField(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    AccessLevelEnum _accessModifer = p.getAccessModifer();
    String _literal = _accessModifer.getLiteral();
    String _string = _literal.toString();
    String _lowerCase = _string.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(" ");
    CharSequence _determineJeasePropertyType = this.determineJeasePropertyType(p);
    _builder.append(_determineJeasePropertyType, "");
    _builder.append(" ");
    String _name = p.getName();
    String _string_1 = _name.toString();
    String _lowerCase_1 = _string_1.toLowerCase();
    _builder.append(_lowerCase_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence determineJeasePropertyType(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    TypeEnum _type = p.getType();
    String _literal = _type.getLiteral();
    final String _switchValue = _literal;
    boolean _matched = false;
    if (!_matched) {
      TypeEnum _type_1 = p.getType();
      String _literal_1 = _type_1.getLiteral();
      boolean _equals = _literal_1.equals("string");
      if (_equals) {
        _matched=true;
        CharSequence _jeasePropertyCaseString = this.toJeasePropertyCaseString(p);
        _switchResult = _jeasePropertyCaseString;
      }
    }
    if (!_matched) {
      TypeEnum _type_2 = p.getType();
      String _literal_2 = _type_2.getLiteral();
      boolean _equals_1 = _literal_2.equals("date");
      if (_equals_1) {
        _matched=true;
        CharSequence _jeasePropertyCaseDate = this.toJeasePropertyCaseDate(p);
        _switchResult = _jeasePropertyCaseDate;
      }
    }
    if (!_matched) {
      CharSequence _jeasePropertyFieldNormal = this.toJeasePropertyFieldNormal(p);
      _switchResult = _jeasePropertyFieldNormal;
    }
    _builder.append(_switchResult, "");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toJeasePropertyCaseString(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String");
    return _builder;
  }
  
  public CharSequence toJeasePropertyCaseDate(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Date");
    return _builder;
  }
  
  public CharSequence toJeasePropertyFieldNormal(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    TypeEnum _type = p.getType();
    String _literal = _type.getLiteral();
    String _string = _literal.toString();
    String _lowerCase = _string.toLowerCase();
    _builder.append(_lowerCase, "");
    return _builder;
  }
  
  public CharSequence toJeaseEditorClass(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import jease.cms.web.content.editor.ContentEditor;");
    _builder.newLine();
    _builder.append("import jfix.zk.Datetimefield;");
    _builder.newLine();
    _builder.append("import jfix.zk.RichTextarea;");
    _builder.newLine();
    _builder.append("import jfix.zk.Textfield;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = ct.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("Editor extends ContentEditor<");
    String _name_1 = ct.getName();
    String _string_1 = _name_1.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        _builder.append(" \t");
        CharSequence _xifexpression = null;
        TypeEnum _type = p.getType();
        String _literal = _type.getLiteral();
        boolean _equals = _literal.equals("date");
        if (_equals) {
          CharSequence _insertDateField = this.insertDateField(p);
          _xifexpression = _insertDateField;
        } else {
          CharSequence _insertNonDateField = this.insertNonDateField(p);
          _xifexpression = _insertNonDateField;
        }
        _builder.append(_xifexpression, " 	");
        _builder.append(" \t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public ");
    String _name_2 = ct.getName();
    String _string_2 = _name_2.toString();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_string_2);
    _builder.append(_firstUpper_2, " ");
    _builder.append("Editor() {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public void init() {");
    _builder.newLine();
    {
      EList<Property> _hasProperties_1 = ct.getHasProperties();
      for(final Property p_1 : _hasProperties_1) {
        _builder.append("   \t");
        _builder.append("add(\"");
        String _name_3 = p_1.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_3, "   	");
        _builder.append("\", ");
        String _name_4 = p_1.getName();
        String _lowerCase = _name_4.toLowerCase();
        _builder.append(_lowerCase, "   	");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public void load() {");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    {
      EList<Property> _hasProperties_2 = ct.getHasProperties();
      for(final Property p_2 : _hasProperties_2) {
        _builder.append(" \t");
        CharSequence _xifexpression_1 = null;
        TypeEnum _type_1 = p_2.getType();
        String _literal_1 = _type_1.getLiteral();
        String _lowerCase_1 = _literal_1.toLowerCase();
        boolean _equals_1 = _lowerCase_1.equals("date");
        if (_equals_1) {
          CharSequence _setDate = this.setDate(p_2);
          _xifexpression_1 = _setDate;
        } else {
          CharSequence _setText = this.setText(p_2);
          _xifexpression_1 = _setText;
        }
        _builder.append(_xifexpression_1, " 	");
        _builder.append(" \t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public void validate() {");
    _builder.newLine();
    {
      EList<Property> _hasProperties_3 = ct.getHasProperties();
      for(final Property p_3 : _hasProperties_3) {
        _builder.append(" \t \t");
        _builder.append("validate(");
        String _name_5 = p_3.getName();
        String _lowerCase_2 = _name_5.toLowerCase();
        _builder.append(_lowerCase_2, " 	 	");
        _builder.append(".isEmpty(), \"");
        String _name_6 = p_3.getName();
        String _string_3 = _name_6.toString();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_string_3);
        _builder.append(_firstUpper_4, " 	 	");
        _builder.append(" required\");\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(" ");
    _builder.append("public void save() {");
    _builder.newLine();
    {
      EList<Property> _hasProperties_4 = ct.getHasProperties();
      for(final Property p_4 : _hasProperties_4) {
        CharSequence _switchResult = null;
        TypeEnum _type_2 = p_4.getType();
        String _literal_2 = _type_2.getLiteral();
        final String _switchValue = _literal_2;
        boolean _matched = false;
        if (!_matched) {
          TypeEnum _type_3 = p_4.getType();
          String _literal_3 = _type_3.getLiteral();
          String _lowerCase_3 = _literal_3.toLowerCase();
          boolean _equals_2 = _lowerCase_3.equals("date");
          if (_equals_2) {
            _matched=true;
            CharSequence _date = this.getDate(p_4);
            _switchResult = _date;
          }
        }
        if (!_matched) {
          TypeEnum _type_4 = p_4.getType();
          String _literal_4 = _type_4.getLiteral();
          String _lowerCase_4 = _literal_4.toLowerCase();
          boolean _equals_3 = _lowerCase_4.equals("string");
          if (_equals_3) {
            _matched=true;
            CharSequence _text = this.getText(p_4);
            _switchResult = _text;
          }
        }
        if (!_matched) {
          TypeEnum _type_5 = p_4.getType();
          String _literal_5 = _type_5.getLiteral();
          String _lowerCase_5 = _literal_5.toLowerCase();
          boolean _equals_4 = _lowerCase_5.equals("int");
          if (_equals_4) {
            _matched=true;
            CharSequence _int = this.getInt(p_4);
            _switchResult = _int;
          }
        }
        if (!_matched) {
          TypeEnum _type_6 = p_4.getType();
          String _literal_6 = _type_6.getLiteral();
          String _lowerCase_6 = _literal_6.toLowerCase();
          boolean _equals_5 = _lowerCase_6.equals("float");
          if (_equals_5) {
            _matched=true;
            CharSequence _float = this.getFloat(p_4);
            _switchResult = _float;
          }
        }
        if (!_matched) {
          TypeEnum _type_7 = p_4.getType();
          String _literal_7 = _type_7.getLiteral();
          String _lowerCase_7 = _literal_7.toLowerCase();
          boolean _equals_6 = _lowerCase_7.equals("double");
          if (_equals_6) {
            _matched=true;
            CharSequence _double = this.getDouble(p_4);
            _switchResult = _double;
          }
        }
        _builder.append(_switchResult, "");
        _builder.append(" \t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getInt(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getNode().set");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("(parseInt(");
    String _name_1 = p.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".getText()));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getFloat(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getNode().set");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("(parseFloat(");
    String _name_1 = p.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".getText());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getDouble(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getNode().set");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("(parseDouble(");
    String _name_1 = p.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".getText());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getDate(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getNode().set");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    String _name_1 = p.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".getDate());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getText(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getNode().set");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    String _name_1 = p.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".getText());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence setDate(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = p.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".setDate(getNode().get");
    String _name_1 = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence setText(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = p.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".setText(getNode().get");
    String _name_1 = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence insertDateField(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Datetimefield ");
    String _name = p.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(" = new Datetimefield();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence insertNonDateField(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Textfield ");
    String _name = p.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("  = new Textfield();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence getDateView(final ContentType ct, final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td><b>");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(":</b></td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td><%=String.format(\"%1$tF %1$tR\",");
    _builder.newLine();
    _builder.append("                  ");
    String _name_1 = ct.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "                  ");
    _builder.append(".get");
    String _name_2 = p.getName();
    String _string = _name_2.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper_1, "                  ");
    _builder.append("())%></td>");
    _builder.newLineIfNotEmpty();
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getTextView(final ContentType ct, final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td><b>");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(":</b></td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td><%=");
    String _name_1 = ct.getName();
    String _lowerCase = _name_1.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(".get");
    String _name_2 = p.getName();
    String _string = _name_2.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper_1, "");
    _builder.append("()%></td>");
    _builder.newLineIfNotEmpty();
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJeaseJSP(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@page import=\"");
    String _name = ct.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("\"%>");
    _builder.newLineIfNotEmpty();
    _builder.append("<%");
    _builder.newLine();
    _builder.append(" ");
    String _name_1 = ct.getName();
    String _string_1 = _name_1.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string_1);
    _builder.append(_firstUpper_1, " ");
    _builder.append(" ");
    String _name_2 = ct.getName();
    String _lowerCase = _name_2.toLowerCase();
    _builder.append(_lowerCase, " ");
    _builder.append(" = (");
    String _name_3 = ct.getName();
    String _string_2 = _name_3.toString();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_string_2);
    _builder.append(_firstUpper_2, " ");
    _builder.append(")request.getAttribute(\"Node\");");
    _builder.newLineIfNotEmpty();
    _builder.append("%>");
    _builder.newLine();
    _builder.append("<h1><%=");
    String _name_4 = ct.getName();
    String _lowerCase_1 = _name_4.toLowerCase();
    _builder.append(_lowerCase_1, "");
    _builder.append(".getTitle()%></h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        CharSequence _xifexpression = null;
        TypeEnum _type = p.getType();
        String _literal = _type.getLiteral();
        boolean _equals = _literal.equals("date");
        if (_equals) {
          CharSequence _dateView = this.getDateView(ct, p);
          _xifexpression = _dateView;
        } else {
          CharSequence _textView = this.getTextView(ct, p);
          _xifexpression = _textView;
        }
        _builder.append(_xifexpression, "");
        _builder.append(" \t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJeaseXML(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<jease>");
    _builder.newLine();
    _builder.append("<component>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<domain>");
    String _name = ct.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "		");
    _builder.append("</domain>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<editor>");
    String _name_1 = ct.getName();
    String _string_1 = _name_1.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string_1);
    _builder.append(_firstUpper_1, "		");
    _builder.append("Editor</editor>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<icon></icon>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<view>");
    String _name_2 = ct.getName();
    String _string_2 = _name_2.toString();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_string_2);
    _builder.append(_firstUpper_2, "		");
    _builder.append(".jsp</view>");
    _builder.newLineIfNotEmpty();
    _builder.append("</component>");
    _builder.newLine();
    _builder.append("</jease>");
    _builder.newLine();
    return _builder;
  }
  
  public void toN2Class(final ContentType ct, final IFileSystemAccess fsa) {
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + ".cs");
    CharSequence _n2ClassFile = this.toN2ClassFile(ct);
    fsa.generateFile(_plus, _n2ClassFile);
    String _plus_1 = ("default" + ".aspx.cs");
    CharSequence _n2CodeBehindFile = this.toN2CodeBehindFile(ct);
    fsa.generateFile(_plus_1, _n2CodeBehindFile);
    String _plus_2 = ("default" + ".aspx");
    CharSequence _n2AspxFile = this.toN2AspxFile(ct);
    fsa.generateFile(_plus_2, _n2AspxFile);
  }
  
  public CharSequence toN2ClassFile(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("namespace MySite.Items");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[N2.Details.WithEditableTitle(\"");
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "	");
    _builder.append("\",10)]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public class ");
    String _name_1 = ct.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "	");
    _builder.append(" : N2.ContentItem");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        _builder.append("\t");
        CharSequence _n2PropertyField = this.toN2PropertyField(p);
        _builder.append(_n2PropertyField, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Property> _hasProperties_1 = ct.getHasProperties();
      for(final Property p_1 : _hasProperties_1) {
        _builder.append("\t\t");
        CharSequence _n2Property = this.toN2Property(p_1);
        _builder.append(_n2Property, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2PropertyField(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    AccessLevelEnum _accessModifer = p.getAccessModifer();
    String _literal = _accessModifer.getLiteral();
    String _string = _literal.toString();
    String _lowerCase = _string.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append(" ");
    CharSequence _determineN2PropertyType = this.determineN2PropertyType(p);
    _builder.append(_determineN2PropertyType, "");
    _builder.append(" ");
    String _name = p.getName();
    String _string_1 = _name.toString();
    String _lowerCase_1 = _string_1.toLowerCase();
    _builder.append(_lowerCase_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toN2Property(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    TypeEnum _type = p.getType();
    final TypeEnum _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      TypeEnum _type_1 = p.getType();
      String _literal = _type_1.getLiteral();
      String _lowerCase = _literal.toLowerCase();
      boolean _equals = _lowerCase.equals("string");
      if (_equals) {
        _matched=true;
        CharSequence _n2PropertyString = this.toN2PropertyString(p);
        _switchResult = _n2PropertyString;
      }
    }
    if (!_matched) {
      TypeEnum _type_2 = p.getType();
      String _literal_1 = _type_2.getLiteral();
      String _lowerCase_1 = _literal_1.toLowerCase();
      boolean _equals_1 = _lowerCase_1.equals("date");
      if (_equals_1) {
        _matched=true;
        CharSequence _n2PropertyDateTime = this.toN2PropertyDateTime(p);
        _switchResult = _n2PropertyDateTime;
      }
    }
    if (!_matched) {
      CharSequence _n2PropertyNormal = this.toN2PropertyNormal(p);
      _switchResult = _n2PropertyNormal;
    }
    _builder.append(_switchResult, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toN2PropertyString(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[N2.Details.EditableTextBox(\"");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("\",20)]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[N2.Web.UI.EditorModifier(\"TextMode\", TextBoxMode.MultiLine)]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String ");
    String _name_1 = p.getName();
    String _string_1 = _name_1.toString();
    String _lowerCase = _string_1.toLowerCase();
    _builder.append(_lowerCase, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("get {return this.");
    String _name_2 = p.getName();
    String _string_2 = _name_2.toString();
    String _lowerCase_1 = _string_2.toLowerCase();
    _builder.append(_lowerCase_1, "		");
    _builder.append(";}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("set {this.");
    String _name_3 = p.getName();
    String _string_3 = _name_3.toString();
    String _lowerCase_2 = _string_3.toLowerCase();
    _builder.append(_lowerCase_2, "		");
    _builder.append(" = value;}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2PropertyDateTime(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[N2.Details.Editable(\"");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("\", typeof(SelectedDate), \"SelectedDate\", 20)]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public DateTime ");
    String _name_1 = p.getName();
    String _string_1 = _name_1.toString();
    String _lowerCase = _string_1.toLowerCase();
    _builder.append(_lowerCase, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("get {return this.");
    String _name_2 = p.getName();
    String _string_2 = _name_2.toString();
    String _lowerCase_1 = _string_2.toLowerCase();
    _builder.append(_lowerCase_1, "		");
    _builder.append(";}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("set {this.");
    String _name_3 = p.getName();
    String _string_3 = _name_3.toString();
    String _lowerCase_2 = _string_3.toLowerCase();
    _builder.append(_lowerCase_2, "		");
    _builder.append(" = value;}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2PropertyNormal(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[N2.Details.EditableTextBox(\"");
    String _name = p.getName();
    String _string = _name.toString();
    String _firstUpper = StringExtensions.toFirstUpper(_string);
    _builder.append(_firstUpper, "");
    _builder.append("\",20)]");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String ");
    String _name_1 = p.getName();
    String _string_1 = _name_1.toString();
    String _lowerCase = _string_1.toLowerCase();
    _builder.append(_lowerCase, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("get {return this.");
    String _name_2 = p.getName();
    String _string_2 = _name_2.toString();
    String _lowerCase_1 = _string_2.toLowerCase();
    _builder.append(_lowerCase_1, "		");
    _builder.append(";}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("set {this.");
    String _name_3 = p.getName();
    String _string_3 = _name_3.toString();
    String _lowerCase_2 = _string_3.toLowerCase();
    _builder.append(_lowerCase_2, "		");
    _builder.append(" = value;}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2CodeBehindFile(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System.Web.Security;");
    _builder.newLine();
    _builder.append("using System.Web.UI;");
    _builder.newLine();
    _builder.append("using System.Web.UI.WebControls;");
    _builder.newLine();
    _builder.append("using System.Web.UI.WebControls.WebParts;");
    _builder.newLine();
    _builder.append("using System.Web.UI.HTMLControls;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace MySite");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public partial class _Default : N2.Web.UI.Page<Items.");
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected void Page_Load(object sender, EventArgs e);\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2AspxFile(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<%@ Page Language=\"C#\" AutoEventWireup=\"true\" CodeFile=\"Default.aspx.cs\" Inherits=\"_Default\" %>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
    _builder.newLine();
    _builder.append("<head runat=\"server\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title></title>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<form id=\"form1\" runat=\"server\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<h1><%= CurrentPage.Title %></h1>");
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        CharSequence _n2PropertyAspx = this.toN2PropertyAspx(p);
        _builder.append(_n2PropertyAspx, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toN2PropertyAspx(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<n2: Display PropertyName=\"");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\" runat=\"server\" />");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence determineN2PropertyType(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    TypeEnum _type = p.getType();
    String _literal = _type.getLiteral();
    final String _switchValue = _literal;
    boolean _matched = false;
    if (!_matched) {
      TypeEnum _type_1 = p.getType();
      String _literal_1 = _type_1.getLiteral();
      boolean _equals = _literal_1.equals("string");
      if (_equals) {
        _matched=true;
        CharSequence _n2PropertyCaseString = this.toN2PropertyCaseString(p);
        _switchResult = _n2PropertyCaseString;
      }
    }
    if (!_matched) {
      TypeEnum _type_2 = p.getType();
      String _literal_2 = _type_2.getLiteral();
      boolean _equals_1 = _literal_2.equals("date");
      if (_equals_1) {
        _matched=true;
        CharSequence _n2PropertyCaseDate = this.toN2PropertyCaseDate(p);
        _switchResult = _n2PropertyCaseDate;
      }
    }
    if (!_matched) {
      CharSequence _jeasePropertyFieldNormal = this.toJeasePropertyFieldNormal(p);
      _switchResult = _jeasePropertyFieldNormal;
    }
    _builder.append(_switchResult, "");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toN2PropertyCaseString(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String");
    return _builder;
  }
  
  public CharSequence toN2PropertyCaseDate(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DateTime");
    return _builder;
  }
  
  public CharSequence toN2PropertyFieldNormal(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    TypeEnum _type = p.getType();
    String _literal = _type.getLiteral();
    String _string = _literal.toString();
    String _lowerCase = _string.toLowerCase();
    _builder.append(_lowerCase, "");
    return _builder;
  }
  
  public void toConcrete5(final ContentType ct, final IFileSystemAccess fsa) {
    CharSequence _viewConcrete5 = this.toViewConcrete5();
    fsa.generateFile("view.php", _viewConcrete5);
    CharSequence _addConcrete5 = this.toAddConcrete5(ct);
    fsa.generateFile("add.php", _addConcrete5);
    CharSequence _controllerConcrete5 = this.toControllerConcrete5(ct);
    fsa.generateFile("controller.php", _controllerConcrete5);
    CharSequence _editConcrete5 = this.toEditConcrete5(ct);
    fsa.generateFile("edit.php", _editConcrete5);
    CharSequence _dBConcrete5 = this.toDBConcrete5(ct);
    fsa.generateFile("db.xml", _dBConcrete5);
  }
  
  public CharSequence toViewConcrete5() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php echo $content?>");
    return _builder;
  }
  
  public CharSequence toControllerConcrete5(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("class ");
    String _name = ct.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("BlockController extends BlockController {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var $pobj;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected $btDescription = \"Block for \" ");
    String _name_1 = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "	");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected $btName = \"");
    String _name_2 = ct.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "	");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected $btTable = \'bt");
    String _name_3 = ct.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "	");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected $btInterfaceWidth = \"350\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected $btInterfaceHeight = \"300\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("?>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toDBConcrete5(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<schema version=\"0.3\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table name=\"bt");
    String _name = ct.getName();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "	");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<field name=\"bID\" type=\"I\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<key />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unsigned />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</field>");
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        _builder.append("\t\t\t\t");
        CharSequence _concrete5DBProperty = this.toConcrete5DBProperty(p);
        _builder.append(_concrete5DBProperty, "				");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</schema>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toAddConcrete5(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>This is the Add template for ");
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        _builder.append("\t\t");
        CharSequence _concrete5AddForm = this.toConcrete5AddForm(p);
        _builder.append(_concrete5AddForm, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence toEditConcrete5(final ContentType ct) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>This is the edit template for ");
    String _name = ct.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Property> _hasProperties = ct.getHasProperties();
      for(final Property p : _hasProperties) {
        _builder.append("\t");
        CharSequence _concrete5EditForm = this.toConcrete5EditForm(p);
        _builder.append(_concrete5EditForm, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence toConcrete5DBProperty(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<field name=\"");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\" type=\"X2\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</field>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toConcrete5AddForm(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php echo $form->label(\'");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\', \'");
    String _name_1 = p.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("\');?>");
    _builder.newLineIfNotEmpty();
    _builder.append("<?php echo $form->text(\'");
    String _name_2 = p.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "");
    _builder.append("\', array(\'style\' => \'width: 320px\'));?>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toConcrete5EditForm(final Property p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php echo $form->label(\'");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("\', \'");
    String _name_1 = p.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("\');?>");
    _builder.newLineIfNotEmpty();
    _builder.append("<?php echo $form->text(\'");
    String _name_2 = p.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "");
    _builder.append("\', $content, array(\'style\' => \'width: 320px\'));?>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void toPlone(final ContentType ct, final IFileSystemAccess fsa) {
    fsa.generateFile("ErrorLogJDSL.txt", "An error has been encountered. Error code 1: The CMS is currently not supported in Code generator. ");
  }
}
