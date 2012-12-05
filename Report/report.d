# vim: ft=make
.PHONY: report._graphics
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/amsfonts/amsfonts.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/amsfonts/amssymb.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/base/article.cls)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/carlisle/remreset.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/graphics.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/graphicx.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/keyval.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/trig.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/llncs/llncs.cls)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/oberdiek/aliascnt.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/tools/multicol.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/url/url.sty)
report.aux report.aux.make report.d report.dvi: $(call path-norm,report.tex)
.SECONDEXPANSION:
-include images/cat.gpi.d
report.d: $$(call graphics-source,images/cat)
report.dvi report._graphics: $$(call graphics-target,images/cat)
-include images/cat.gpi.d
report.d: $$(call graphics-source,images/cat)
report.dvi report._graphics: $$(call graphics-target,images/cat)
-include images/cat.gpi.d
report.d: $$(call graphics-source,images/cat)
report.dvi report._graphics: $$(call graphics-target,images/cat)
-include images/cat.gpi.d
report.d: $$(call graphics-source,images/cat)
report.dvi report._graphics: $$(call graphics-target,images/cat)
