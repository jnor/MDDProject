package mddProject.concreteSyntax.generator;

import java.util.ArrayList;
import jdsl.CMS;
import jdsl.CMSEnum;
import jdsl.ContentModel;
import jdsl.ContentType;
import jdsl.NamedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
        {
          CMSEnum _type = cms.getType();
          String _string = _type.toString();
          boolean _equals = _string.equals("Jease");
          if (_equals) {
            this.toJease(null, fsa);
          }
          for (final ContentType ct : contentList) {
            CMSEnum _type_1 = cms.getType();
            final CMSEnum _switchValue = _type_1;
            boolean _matched_1 = false;
            if (!_matched_1) {
              CMSEnum _type_2 = cms.getType();
              String _string_1 = _type_2.toString();
              boolean _equals_1 = _string_1.equals("Jease");
              if (_equals_1) {
                _matched_1=true;
                this.toJease(ct, fsa);
              }
            }
            if (!_matched_1) {
              CMSEnum _type_3 = cms.getType();
              String _string_2 = _type_3.toString();
              boolean _equals_2 = _string_2.equals("N2");
              if (_equals_2) {
                _matched_1=true;
                this.toN2Class(ct, fsa);
              }
            }
            if (!_matched_1) {
              CMSEnum _type_4 = cms.getType();
              String _string_3 = _type_4.toString();
              boolean _equals_3 = _string_3.equals("Concrete5");
              if (_equals_3) {
                _matched_1=true;
                this.toConcrete5(ct, fsa);
              }
            }
            if (!_matched_1) {
              CMSEnum _type_5 = cms.getType();
              String _string_4 = _type_5.toString();
              boolean _equals_4 = _string_4.equals("Plone");
              if (_equals_4) {
                _matched_1=true;
                this.toPlone(ct, fsa);
              }
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
    fsa.generateFile("cmsOutput.txt", "I,ve been called from toJease method");
  }
  
  public Object toJeaseDomainClass() {
    return null;
  }
  
  public Object toJeaseEditorClass() {
    return null;
  }
  
  public Object toJeaseHTML() {
    return null;
  }
  
  public Object toJeaseXML() {
    return null;
  }
  
  public Object toN2Class(final ContentType ctm, final IFileSystemAccess fsa) {
    return null;
  }
  
  public Object toConcrete5(final ContentType ct, final IFileSystemAccess fsa) {
    return null;
  }
  
  public Object toPlone(final ContentType ct, final IFileSystemAccess fsa) {
    return null;
  }
}
