package dev.antonyholmes.matcalc.bio.app;

import dev.antonyholmes.matcalc.bio.BioModuleLoader;
import dev.antonyholmes.matcalc.bio.FastaWriterModule;
import dev.antonyholmes.matcalc.bio.toolbox.expression.ExpressionModule;
import dev.antonyholmes.matcalc.bio.toolbox.fillgaps.FillGapsModule;
import dev.antonyholmes.matcalc.toolbox.annotation.AnnotationModule;
import dev.antonyholmes.matcalc.toolbox.conversion.ConversionModule;
import dev.antonyholmes.matcalc.toolbox.dna.DnaModule;
import dev.antonyholmes.matcalc.toolbox.genes.GeneAnnotationModule;
import dev.antonyholmes.matcalc.toolbox.genes.info.GeneInfoModule;
 
import dev.antonyholmes.matcalc.toolbox.motifs.MotifsModule;
 
 
 
import dev.antonyholmes.matcalc.toolbox.probes.ProbesModule;
import dev.antonyholmes.matcalc.toolbox.regions.RegionsModule;

public class BioAppModuleLoader extends BioModuleLoader {
  public BioAppModuleLoader() {
    addModule(AnnotationModule.class);
    addModule(FillGapsModule.class);


    addModule(ProbesModule.class);

    addModule(ExpressionModule.class);
    // addModule(ClsModule.class);
    // addModule(PermuteClsModule.class);

    // addModule(GseaPlotModule.class);

    addModule(RegionsModule.class);

    addModule(GeneAnnotationModule.class);

    addModule(ConversionModule.class);

    addModule(GeneInfoModule.class);

    addModule(DnaModule.class);
    addModule(FastaWriterModule.class);

    addModule(MotifsModule.class);

    //
    // Bio modules
    //

 
    // ddModule(ClassifierModule.class);

 
  }
}
