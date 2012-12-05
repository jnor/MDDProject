# vim: ft=make
.PHONY: typeinst._graphics
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/amsfonts/amsfonts.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/amsfonts/amssymb.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/base/article.cls)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/carlisle/remreset.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/graphics.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/graphicx.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/keyval.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/graphics/trig.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/llncs/llncs.cls)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/oberdiek/aliascnt.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/tools/multicol.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,/usr/share/texmf-dist/tex/latex/url/url.sty)
typeinst.aux typeinst.aux.make typeinst.d typeinst.dvi: $(call path-norm,typeinst.tex)
.SECONDEXPANSION:
-include eijkel2.gpi.d
typeinst.d: $$(call graphics-source,eijkel2)
typeinst.dvi typeinst._graphics: $$(call graphics-target,eijkel2)
