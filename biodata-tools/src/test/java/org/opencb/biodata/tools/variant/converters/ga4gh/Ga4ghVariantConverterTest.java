package org.opencb.biodata.tools.variant.converters.ga4gh;

import ga4gh.Variants;
import org.ga4gh.models.CallSet;
import org.ga4gh.models.Variant;
import org.ga4gh.models.VariantSet;
import org.junit.Before;
import org.junit.Test;
import org.opencb.biodata.models.variant.VariantSource;
import org.opencb.biodata.tools.variant.converters.ga4gh.factories.AvroGa4GhVariantFactory;
import org.opencb.biodata.tools.variant.VariantVcfHtsjdkReader;

import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

import static org.opencb.biodata.models.variant.VariantTestUtils.generateVariantWithFormat;

/**
 * Created on 09/08/16
 *
 * @author Jacobo Coll &lt;jacobo167@gmail.com&gt;
 */
public class Ga4ghVariantConverterTest {

    private List<org.opencb.biodata.models.variant.Variant> variants;
    private VariantSource source;

    @Before
    public void setUp() throws Exception {

        variants = Arrays.asList(
                generateVariantWithFormat("10:1000:A:T", "PASS", 10F, "GT:PS:FT",
                        "S1", "0/0", ".",   "PASS",
                        "S2", "0|1", "ps1", "NO_PASS"),
                generateVariantWithFormat("10:2000:A:T,C", "PASS", 0F, "GT:FT",
                        "S1", "1|0",   "PASS",
                        "S2", "0|2", "NO_PASS"));

        source = new VariantSource("CEU-1409-01_5000.vcf.gz", "fid", "sid", "study");
        VariantVcfHtsjdkReader reader = new VariantVcfHtsjdkReader(new GZIPInputStream(this.getClass().getResourceAsStream("/CEU-1409-01_5000.vcf.gz")), source);
        reader.open();
        reader.pre();
        variants = reader.read(3);
        reader.post();
        reader.close();
    }

    @Test
    public void testProto() throws Exception {

        Ga4ghVariantConverter<Variants.Variant> converter = new Ga4ghVariantConverter<>();
        Ga4ghVariantSetConverter<Variants.VariantSet> variantSetConverter = new Ga4ghVariantSetConverter<>();
        Ga4ghCallSetConverter<Variants.CallSet> callSetConverter = new Ga4ghCallSetConverter<>();

        System.out.println(variantSetConverter.convert(source));
        System.out.println(callSetConverter.convert(source));

        List<Variants.Variant> apply = converter.apply(variants);

        for (Variants.Variant variant : apply) {
            System.out.println(variant);
        }

    }

    @Test
    public void testAvro() throws Exception {
        Ga4ghVariantConverter<Variant> converter = new Ga4ghVariantConverter<>(new AvroGa4GhVariantFactory());
        Ga4ghVariantSetConverter<VariantSet> variantSetConverter = new Ga4ghVariantSetConverter<>(new AvroGa4GhVariantFactory());
        Ga4ghCallSetConverter<CallSet> callSetConverter = new Ga4ghCallSetConverter<>(new AvroGa4GhVariantFactory());

        System.out.println(variantSetConverter.convert(source));
        System.out.println(callSetConverter.convert(source));

        List<Variant> apply = converter.apply(variants);

        for (Variant variant : apply) {
            System.out.println(variant);
        }

    }
}
