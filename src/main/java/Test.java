import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String args[]) throws IOException {

        String jsonResponse = "{\n" +
                "  \"q\" : \"chicken\",\n" +
                "  \"from\" : 0,\n" +
                "  \"to\" : 10,\n" +
                "  \"params\" : {\n" +
                "    \"sane\" : [ ],\n" +
                "    \"q\" : [ \"chicken\" ],\n" +
                "    \"app_key\" : [ \"8b9c2a666b2c005a8c34b35a26063330\" ],\n" +
                "    \"app_id\" : [ \"736dba64\" ]\n" +
                "  },\n" +
                "  \"more\" : true,\n" +
                "  \"count\" : 170158,\n" +
                "  \"hits\" : [ {\n" +
                "    \"recipe\" : {\n" +
                "      \"uri\" : \"http://www.edamam.com/ontologies/edamam.owl#recipe_b79327d05b8e5b838ad6cfd9576b30b6\",\n" +
                "      \"label\" : \"Chicken Vesuvio\",\n" +
                "      \"image\" : \"https://www.edamam.com/web-img/e42/e42f9119813e890af34c259785ae1cfb.jpg\",\n" +
                "      \"source\" : \"Serious Eats\",\n" +
                "      \"url\" : \"http://www.seriouseats.com/recipes/2011/12/chicken-vesuvio-recipe.html\",\n" +
                "      \"shareAs\" : \"http://www.edamam.com/recipe/chicken-vesuvio-b79327d05b8e5b838ad6cfd9576b30b6/chicken\",\n" +
                "      \"yield\" : 4.0,\n" +
                "      \"dietLabels\" : [ \"Low-Carb\" ],\n" +
                "      \"healthLabels\" : [ \"Peanut-Free\", \"Tree-Nut-Free\" ],\n" +
                "      \"cautions\" : [ \"Sulfites\" ],\n" +
                "      \"ingredientLines\" : [ \"1/2 cup olive oil\", \"5 cloves garlic, peeled\", \"2 large russet potatoes, peeled and cut into chunks\", \"1 3-4 pound chicken, cut into 8 pieces (or 3 pound chicken legs)\", \"3/4 cup white wine\", \"3/4 cup chicken stock\", \"3 tablespoons chopped parsley\", \"1 tablespoon dried oregano\", \"Salt and pepper\", \"1 cup frozen peas, thawed\" ],\n" +
                "      \"ingredients\" : [ {\n" +
                "        \"text\" : \"1/2 cup olive oil\",\n" +
                "        \"weight\" : 108.0\n" +
                "      }, {\n" +
                "        \"text\" : \"5 cloves garlic, peeled\",\n" +
                "        \"weight\" : 15.0\n" +
                "      }, {\n" +
                "        \"text\" : \"2 large russet potatoes, peeled and cut into chunks\",\n" +
                "        \"weight\" : 738.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1 3-4 pound chicken, cut into 8 pieces (or 3 pound chicken legs)\",\n" +
                "        \"weight\" : 1587.5732950000001\n" +
                "      }, {\n" +
                "        \"text\" : \"3/4 cup white wine\",\n" +
                "        \"weight\" : 169.5\n" +
                "      }, {\n" +
                "        \"text\" : \"3/4 cup chicken stock\",\n" +
                "        \"weight\" : 180.0\n" +
                "      }, {\n" +
                "        \"text\" : \"3 tablespoons chopped parsley\",\n" +
                "        \"weight\" : 11.399999999999999\n" +
                "      }, {\n" +
                "        \"text\" : \"1 tablespoon dried oregano\",\n" +
                "        \"weight\" : 5.9999999998985585\n" +
                "      }, {\n" +
                "        \"text\" : \"Salt and pepper\",\n" +
                "        \"weight\" : 17.696839769999393\n" +
                "      }, {\n" +
                "        \"text\" : \"Salt and pepper\",\n" +
                "        \"weight\" : 8.848419884999696\n" +
                "      }, {\n" +
                "        \"text\" : \"1 cup frozen peas, thawed\",\n" +
                "        \"weight\" : 134.0\n" +
                "      } ],\n" +
                "      \"calories\" : 4230.305691201081,\n" +
                "      \"totalWeight\" : 2972.9302457924105,\n" +
                "      \"totalTime\" : 60.0,\n" +
                "      \"totalNutrients\" : {\n" +
                "        \"ENERC_KCAL\" : {\n" +
                "          \"label\" : \"Energy\",\n" +
                "          \"quantity\" : 4230.305691201081,\n" +
                "          \"unit\" : \"kcal\"\n" +
                "        },\n" +
                "        \"FAT\" : {\n" +
                "          \"label\" : \"Fat\",\n" +
                "          \"quantity\" : 274.57692448260667,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FASAT\" : {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"quantity\" : 62.54398613465762,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FATRN\" : {\n" +
                "          \"label\" : \"Trans\",\n" +
                "          \"quantity\" : 1.047163345382,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FAMS\" : {\n" +
                "          \"label\" : \"Monounsaturated\",\n" +
                "          \"quantity\" : 147.41199987638942,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FAPU\" : {\n" +
                "          \"label\" : \"Polyunsaturated\",\n" +
                "          \"quantity\" : 47.3914730818309,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"CHOCDF\" : {\n" +
                "          \"label\" : \"Carbs\",\n" +
                "          \"quantity\" : 177.8427845163874,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FIBTG\" : {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"quantity\" : 21.103850230861813,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"SUGAR\" : {\n" +
                "          \"label\" : \"Sugars\",\n" +
                "          \"quantity\" : 16.29572988725985,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"PROCNT\" : {\n" +
                "          \"label\" : \"Protein\",\n" +
                "          \"quantity\" : 230.99085117764236,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"CHOLE\" : {\n" +
                "          \"label\" : \"Cholesterol\",\n" +
                "          \"quantity\" : 815.06238045,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"NA\" : {\n" +
                "          \"label\" : \"Sodium\",\n" +
                "          \"quantity\" : 6879.517981530534,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"CA\" : {\n" +
                "          \"label\" : \"Calcium\",\n" +
                "          \"quantity\" : 447.3120299727316,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"MG\" : {\n" +
                "          \"label\" : \"Magnesium\",\n" +
                "          \"quantity\" : 485.56685143215077,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"K\" : {\n" +
                "          \"label\" : \"Potassium\",\n" +
                "          \"quantity\" : 5950.924381476969,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"FE\" : {\n" +
                "          \"label\" : \"Iron\",\n" +
                "          \"quantity\" : 23.630588288190932,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"ZN\" : {\n" +
                "          \"label\" : \"Zinc\",\n" +
                "          \"quantity\" : 18.41378763939628,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"P\" : {\n" +
                "          \"label\" : \"Phosphorus\",\n" +
                "          \"quantity\" : 2234.2507691001497,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITA_RAE\" : {\n" +
                "          \"label\" : \"Vitamin A\",\n" +
                "          \"quantity\" : 637.9185080148637,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITC\" : {\n" +
                "          \"label\" : \"Vitamin C\",\n" +
                "          \"quantity\" : 103.79879744959767,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"THIA\" : {\n" +
                "          \"label\" : \"Thiamin (B1)\",\n" +
                "          \"quantity\" : 1.73140519783562,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"RIBF\" : {\n" +
                "          \"label\" : \"Riboflavin (B2)\",\n" +
                "          \"quantity\" : 1.926703964512464,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"NIA\" : {\n" +
                "          \"label\" : \"Niacin (B3)\",\n" +
                "          \"quantity\" : 87.03578409848684,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITB6A\" : {\n" +
                "          \"label\" : \"Vitamin B6\",\n" +
                "          \"quantity\" : 6.914193343964289,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"FOLDFE\" : {\n" +
                "          \"label\" : \"Folate equivalent (total)\",\n" +
                "          \"quantity\" : 283.3102218162095,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"FOLFD\" : {\n" +
                "          \"label\" : \"Folate (food)\",\n" +
                "          \"quantity\" : 283.3102218162095,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITB12\" : {\n" +
                "          \"label\" : \"Vitamin B12\",\n" +
                "          \"quantity\" : 3.34660450586,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITD\" : {\n" +
                "          \"label\" : \"Vitamin D\",\n" +
                "          \"quantity\" : 107.95498406,\n" +
                "          \"unit\" : \"IU\"\n" +
                "        },\n" +
                "        \"TOCPHA\" : {\n" +
                "          \"label\" : \"Vitamin E\",\n" +
                "          \"quantity\" : 20.17637308858548,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITK1\" : {\n" +
                "          \"label\" : \"Vitamin K\",\n" +
                "          \"quantity\" : 371.9191109601138,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"totalDaily\" : {\n" +
                "        \"ENERC_KCAL\" : {\n" +
                "          \"label\" : \"Energy\",\n" +
                "          \"quantity\" : 211.51528456005406,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FAT\" : {\n" +
                "          \"label\" : \"Fat\",\n" +
                "          \"quantity\" : 422.42603766554873,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FASAT\" : {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"quantity\" : 312.7199306732881,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CHOCDF\" : {\n" +
                "          \"label\" : \"Carbs\",\n" +
                "          \"quantity\" : 59.28092817212914,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FIBTG\" : {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"quantity\" : 84.41540092344725,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"PROCNT\" : {\n" +
                "          \"label\" : \"Protein\",\n" +
                "          \"quantity\" : 461.9817023552847,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CHOLE\" : {\n" +
                "          \"label\" : \"Cholesterol\",\n" +
                "          \"quantity\" : 271.68746015,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"NA\" : {\n" +
                "          \"label\" : \"Sodium\",\n" +
                "          \"quantity\" : 286.64658256377226,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CA\" : {\n" +
                "          \"label\" : \"Calcium\",\n" +
                "          \"quantity\" : 44.73120299727315,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"MG\" : {\n" +
                "          \"label\" : \"Magnesium\",\n" +
                "          \"quantity\" : 115.61115510289305,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"K\" : {\n" +
                "          \"label\" : \"Potassium\",\n" +
                "          \"quantity\" : 126.61541237185041,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FE\" : {\n" +
                "          \"label\" : \"Iron\",\n" +
                "          \"quantity\" : 131.28104604550518,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"ZN\" : {\n" +
                "          \"label\" : \"Zinc\",\n" +
                "          \"quantity\" : 167.3980694490571,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"P\" : {\n" +
                "          \"label\" : \"Phosphorus\",\n" +
                "          \"quantity\" : 319.17868130002137,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITA_RAE\" : {\n" +
                "          \"label\" : \"Vitamin A\",\n" +
                "          \"quantity\" : 70.87983422387376,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITC\" : {\n" +
                "          \"label\" : \"Vitamin C\",\n" +
                "          \"quantity\" : 115.33199716621964,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"THIA\" : {\n" +
                "          \"label\" : \"Thiamin (B1)\",\n" +
                "          \"quantity\" : 144.28376648630166,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"RIBF\" : {\n" +
                "          \"label\" : \"Riboflavin (B2)\",\n" +
                "          \"quantity\" : 148.20799727018954,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"NIA\" : {\n" +
                "          \"label\" : \"Niacin (B3)\",\n" +
                "          \"quantity\" : 543.9736506155427,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITB6A\" : {\n" +
                "          \"label\" : \"Vitamin B6\",\n" +
                "          \"quantity\" : 531.8610264587915,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FOLDFE\" : {\n" +
                "          \"label\" : \"Folate equivalent (total)\",\n" +
                "          \"quantity\" : 70.82755545405237,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITB12\" : {\n" +
                "          \"label\" : \"Vitamin B12\",\n" +
                "          \"quantity\" : 139.44185441083332,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITD\" : {\n" +
                "          \"label\" : \"Vitamin D\",\n" +
                "          \"quantity\" : 719.6998937333334,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"TOCPHA\" : {\n" +
                "          \"label\" : \"Vitamin E\",\n" +
                "          \"quantity\" : 134.5091539239032,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITK1\" : {\n" +
                "          \"label\" : \"Vitamin K\",\n" +
                "          \"quantity\" : 309.93259246676155,\n" +
                "          \"unit\" : \"%\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"digest\" : [ {\n" +
                "        \"label\" : \"Fat\",\n" +
                "        \"tag\" : \"FAT\",\n" +
                "        \"schemaOrgTag\" : \"fatContent\",\n" +
                "        \"total\" : 274.57692448260667,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 422.42603766554873,\n" +
                "        \"unit\" : \"g\",\n" +
                "        \"sub\" : [ {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"tag\" : \"FASAT\",\n" +
                "          \"schemaOrgTag\" : \"saturatedFatContent\",\n" +
                "          \"total\" : 62.54398613465762,\n" +
                "          \"hasRDI\" : true,\n" +
                "          \"daily\" : 312.7199306732881,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Trans\",\n" +
                "          \"tag\" : \"FATRN\",\n" +
                "          \"schemaOrgTag\" : \"transFatContent\",\n" +
                "          \"total\" : 1.047163345382,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Monounsaturated\",\n" +
                "          \"tag\" : \"FAMS\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 147.41199987638942,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Polyunsaturated\",\n" +
                "          \"tag\" : \"FAPU\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 47.3914730818309,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"label\" : \"Carbs\",\n" +
                "        \"tag\" : \"CHOCDF\",\n" +
                "        \"schemaOrgTag\" : \"carbohydrateContent\",\n" +
                "        \"total\" : 177.8427845163874,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 59.28092817212914,\n" +
                "        \"unit\" : \"g\",\n" +
                "        \"sub\" : [ {\n" +
                "          \"label\" : \"Carbs (net)\",\n" +
                "          \"tag\" : \"CHOCDF.net\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 156.7389342855256,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"tag\" : \"FIBTG\",\n" +
                "          \"schemaOrgTag\" : \"fiberContent\",\n" +
                "          \"total\" : 21.103850230861813,\n" +
                "          \"hasRDI\" : true,\n" +
                "          \"daily\" : 84.41540092344725,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Sugars\",\n" +
                "          \"tag\" : \"SUGAR\",\n" +
                "          \"schemaOrgTag\" : \"sugarContent\",\n" +
                "          \"total\" : 16.29572988725985,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Sugars, added\",\n" +
                "          \"tag\" : \"SUGAR.added\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 0.0,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"label\" : \"Protein\",\n" +
                "        \"tag\" : \"PROCNT\",\n" +
                "        \"schemaOrgTag\" : \"proteinContent\",\n" +
                "        \"total\" : 230.99085117764236,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 461.9817023552847,\n" +
                "        \"unit\" : \"g\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Cholesterol\",\n" +
                "        \"tag\" : \"CHOLE\",\n" +
                "        \"schemaOrgTag\" : \"cholesterolContent\",\n" +
                "        \"total\" : 815.06238045,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 271.68746015,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Sodium\",\n" +
                "        \"tag\" : \"NA\",\n" +
                "        \"schemaOrgTag\" : \"sodiumContent\",\n" +
                "        \"total\" : 6879.517981530534,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 286.64658256377226,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Calcium\",\n" +
                "        \"tag\" : \"CA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 447.3120299727316,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 44.73120299727315,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Magnesium\",\n" +
                "        \"tag\" : \"MG\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 485.56685143215077,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 115.61115510289305,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Potassium\",\n" +
                "        \"tag\" : \"K\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 5950.924381476969,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 126.61541237185041,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Iron\",\n" +
                "        \"tag\" : \"FE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 23.630588288190932,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 131.28104604550518,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Zinc\",\n" +
                "        \"tag\" : \"ZN\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 18.41378763939628,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 167.3980694490571,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Phosphorus\",\n" +
                "        \"tag\" : \"P\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 2234.2507691001497,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 319.17868130002137,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin A\",\n" +
                "        \"tag\" : \"VITA_RAE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 637.9185080148637,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 70.87983422387376,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin C\",\n" +
                "        \"tag\" : \"VITC\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 103.79879744959767,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 115.33199716621964,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Thiamin (B1)\",\n" +
                "        \"tag\" : \"THIA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 1.73140519783562,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 144.28376648630166,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Riboflavin (B2)\",\n" +
                "        \"tag\" : \"RIBF\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 1.926703964512464,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 148.20799727018954,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Niacin (B3)\",\n" +
                "        \"tag\" : \"NIA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 87.03578409848684,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 543.9736506155427,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin B6\",\n" +
                "        \"tag\" : \"VITB6A\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 6.914193343964289,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 531.8610264587915,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folate equivalent (total)\",\n" +
                "        \"tag\" : \"FOLDFE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 283.3102218162095,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 70.82755545405237,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folate (food)\",\n" +
                "        \"tag\" : \"FOLFD\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 283.3102218162095,\n" +
                "        \"hasRDI\" : false,\n" +
                "        \"daily\" : 0.0,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folic acid\",\n" +
                "        \"tag\" : \"FOLAC\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 0.0,\n" +
                "        \"hasRDI\" : false,\n" +
                "        \"daily\" : 0.0,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin B12\",\n" +
                "        \"tag\" : \"VITB12\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 3.34660450586,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 139.44185441083332,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin D\",\n" +
                "        \"tag\" : \"VITD\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 107.95498406,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 719.6998937333334,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin E\",\n" +
                "        \"tag\" : \"TOCPHA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 20.17637308858548,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 134.5091539239032,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin K\",\n" +
                "        \"tag\" : \"VITK1\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 371.9191109601138,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 309.93259246676155,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      } ]\n" +
                "    },\n" +
                "    \"bookmarked\" : false,\n" +
                "    \"bought\" : false\n" +
                "  }, {\n" +
                "    \"recipe\" : {\n" +
                "      \"uri\" : \"http://www.edamam.com/ontologies/edamam.owl#recipe_8275bb28647abcedef0baaf2dcf34f8b\",\n" +
                "      \"label\" : \"Chicken Paprikash\",\n" +
                "      \"image\" : \"https://www.edamam.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff.jpg\",\n" +
                "      \"source\" : \"No Recipes\",\n" +
                "      \"url\" : \"http://norecipes.com/recipe/chicken-paprikash/\",\n" +
                "      \"shareAs\" : \"http://www.edamam.com/recipe/chicken-paprikash-8275bb28647abcedef0baaf2dcf34f8b/chicken\",\n" +
                "      \"yield\" : 4.0,\n" +
                "      \"dietLabels\" : [ \"Low-Carb\" ],\n" +
                "      \"healthLabels\" : [ \"Peanut-Free\", \"Tree-Nut-Free\", \"Alcohol-Free\" ],\n" +
                "      \"cautions\" : [ \"Sulfites\", \"FODMAP\" ],\n" +
                "      \"ingredientLines\" : [ \"640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)\", \"1/2 teaspoon salt\", \"1/4 teaspoon black pepper\", \"1 tablespoon butter – cultured unsalted (or olive oil)\", \"240 grams onion sliced thin (1 large onion)\", \"70 grams Anaheim pepper chopped (1 large pepper)\", \"25 grams paprika (about 1/4 cup)\", \"1 cup chicken stock\", \"1/2 teaspoon salt\", \"1/2 cup sour cream\", \"1 tablespoon flour – all-purpose\" ],\n" +
                "      \"ingredients\" : [ {\n" +
                "        \"text\" : \"640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)\",\n" +
                "        \"weight\" : 640.0\n" +
                "      }, {\n" +
                "        \"text\" : \"640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)\",\n" +
                "        \"weight\" : 640.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1/2 teaspoon salt\",\n" +
                "        \"weight\" : 3.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1/4 teaspoon black pepper\",\n" +
                "        \"weight\" : 0.725\n" +
                "      }, {\n" +
                "        \"text\" : \"1 tablespoon butter – cultured unsalted (or olive oil)\",\n" +
                "        \"weight\" : 13.5\n" +
                "      }, {\n" +
                "        \"text\" : \"240 grams onion sliced thin (1 large onion)\",\n" +
                "        \"weight\" : 78.125\n" +
                "      }, {\n" +
                "        \"text\" : \"70 grams Anaheim pepper chopped (1 large pepper)\",\n" +
                "        \"weight\" : 56.25\n" +
                "      }, {\n" +
                "        \"text\" : \"25 grams paprika (about 1/4 cup)\",\n" +
                "        \"weight\" : 27.200000000459866\n" +
                "      }, {\n" +
                "        \"text\" : \"1 cup chicken stock\",\n" +
                "        \"weight\" : 240.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1/2 teaspoon salt\",\n" +
                "        \"weight\" : 3.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1/2 cup sour cream\",\n" +
                "        \"weight\" : 115.0\n" +
                "      }, {\n" +
                "        \"text\" : \"1 tablespoon flour – all-purpose\",\n" +
                "        \"weight\" : 7.8124999998679145\n" +
                "      } ],\n" +
                "      \"calories\" : 3033.2012500008163,\n" +
                "      \"totalWeight\" : 1824.6125000003276,\n" +
                "      \"totalTime\" : 0.0,\n" +
                "      \"totalNutrients\" : {\n" +
                "        \"ENERC_KCAL\" : {\n" +
                "          \"label\" : \"Energy\",\n" +
                "          \"quantity\" : 3033.2012500008163,\n" +
                "          \"unit\" : \"kcal\"\n" +
                "        },\n" +
                "        \"FAT\" : {\n" +
                "          \"label\" : \"Fat\",\n" +
                "          \"quantity\" : 208.05040250005803,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FASAT\" : {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"quantity\" : 61.207636375009635,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FATRN\" : {\n" +
                "          \"label\" : \"Trans\",\n" +
                "          \"quantity\" : 0.8448,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FAMS\" : {\n" +
                "          \"label\" : \"Monounsaturated\",\n" +
                "          \"quantity\" : 85.78187337500766,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FAPU\" : {\n" +
                "          \"label\" : \"Polyunsaturated\",\n" +
                "          \"quantity\" : 39.88905187503517,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"CHOCDF\" : {\n" +
                "          \"label\" : \"Carbs\",\n" +
                "          \"quantity\" : 47.816761250147486,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"FIBTG\" : {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"quantity\" : 12.059037500156926,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"SUGAR\" : {\n" +
                "          \"label\" : \"Sugars\",\n" +
                "          \"quantity\" : 16.123463750047193,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"PROCNT\" : {\n" +
                "          \"label\" : \"Protein\",\n" +
                "          \"quantity\" : 236.58131375005138,\n" +
                "          \"unit\" : \"g\"\n" +
                "        },\n" +
                "        \"CHOLE\" : {\n" +
                "          \"label\" : \"Cholesterol\",\n" +
                "          \"quantity\" : 1283.0,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"NA\" : {\n" +
                "          \"label\" : \"Sodium\",\n" +
                "          \"quantity\" : 3945.65975000031,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"CA\" : {\n" +
                "          \"label\" : \"Calcium\",\n" +
                "          \"quantity\" : 326.0403750010333,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"MG\" : {\n" +
                "          \"label\" : \"Magnesium\",\n" +
                "          \"quantity\" : 324.8095000007895,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"K\" : {\n" +
                "          \"label\" : \"Potassium\",\n" +
                "          \"quantity\" : 4014.232125010343,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"FE\" : {\n" +
                "          \"label\" : \"Iron\",\n" +
                "          \"quantity\" : 16.44184625009567,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"ZN\" : {\n" +
                "          \"label\" : \"Zinc\",\n" +
                "          \"quantity\" : 22.48163750001899,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"P\" : {\n" +
                "          \"label\" : \"Phosphorus\",\n" +
                "          \"quantity\" : 2388.5722500013017,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITA_RAE\" : {\n" +
                "          \"label\" : \"Vitamin A\",\n" +
                "          \"quantity\" : 1144.9192500113265,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITC\" : {\n" +
                "          \"label\" : \"Vitamin C\",\n" +
                "          \"quantity\" : 143.94730000000413,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"THIA\" : {\n" +
                "          \"label\" : \"Thiamin (B1)\",\n" +
                "          \"quantity\" : 1.310280500001359,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"RIBF\" : {\n" +
                "          \"label\" : \"Riboflavin (B2)\",\n" +
                "          \"quantity\" : 2.988508750005604,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"NIA\" : {\n" +
                "          \"label\" : \"Niacin (B3)\",\n" +
                "          \"quantity\" : 67.97661300004462,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITB6A\" : {\n" +
                "          \"label\" : \"Vitamin B6\",\n" +
                "          \"quantity\" : 5.478774250009787,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"FOLDFE\" : {\n" +
                "          \"label\" : \"Folate equivalent (total)\",\n" +
                "          \"quantity\" : 101.71375000019098,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"FOLFD\" : {\n" +
                "          \"label\" : \"Folate (food)\",\n" +
                "          \"quantity\" : 101.71375000019098,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITB12\" : {\n" +
                "          \"label\" : \"Vitamin B12\",\n" +
                "          \"quantity\" : 7.682,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        },\n" +
                "        \"VITD\" : {\n" +
                "          \"label\" : \"Vitamin D\",\n" +
                "          \"quantity\" : 48.1,\n" +
                "          \"unit\" : \"IU\"\n" +
                "        },\n" +
                "        \"TOCPHA\" : {\n" +
                "          \"label\" : \"Vitamin E\",\n" +
                "          \"quantity\" : 13.406427500133741,\n" +
                "          \"unit\" : \"mg\"\n" +
                "        },\n" +
                "        \"VITK1\" : {\n" +
                "          \"label\" : \"Vitamin K\",\n" +
                "          \"quantity\" : 71.52511250036889,\n" +
                "          \"unit\" : \"µg\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"totalDaily\" : {\n" +
                "        \"ENERC_KCAL\" : {\n" +
                "          \"label\" : \"Energy\",\n" +
                "          \"quantity\" : 151.6600625000408,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FAT\" : {\n" +
                "          \"label\" : \"Fat\",\n" +
                "          \"quantity\" : 320.0775423077816,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FASAT\" : {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"quantity\" : 306.03818187504817,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CHOCDF\" : {\n" +
                "          \"label\" : \"Carbs\",\n" +
                "          \"quantity\" : 15.938920416715828,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FIBTG\" : {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"quantity\" : 48.2361500006277,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"PROCNT\" : {\n" +
                "          \"label\" : \"Protein\",\n" +
                "          \"quantity\" : 473.16262750010276,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CHOLE\" : {\n" +
                "          \"label\" : \"Cholesterol\",\n" +
                "          \"quantity\" : 427.6666666666667,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"NA\" : {\n" +
                "          \"label\" : \"Sodium\",\n" +
                "          \"quantity\" : 164.40248958334624,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"CA\" : {\n" +
                "          \"label\" : \"Calcium\",\n" +
                "          \"quantity\" : 32.60403750010333,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"MG\" : {\n" +
                "          \"label\" : \"Magnesium\",\n" +
                "          \"quantity\" : 77.33559523828322,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"K\" : {\n" +
                "          \"label\" : \"Potassium\",\n" +
                "          \"quantity\" : 85.40919414915624,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FE\" : {\n" +
                "          \"label\" : \"Iron\",\n" +
                "          \"quantity\" : 91.34359027830926,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"ZN\" : {\n" +
                "          \"label\" : \"Zinc\",\n" +
                "          \"quantity\" : 204.3785227274454,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"P\" : {\n" +
                "          \"label\" : \"Phosphorus\",\n" +
                "          \"quantity\" : 341.2246071430431,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITA_RAE\" : {\n" +
                "          \"label\" : \"Vitamin A\",\n" +
                "          \"quantity\" : 127.2132500012585,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITC\" : {\n" +
                "          \"label\" : \"Vitamin C\",\n" +
                "          \"quantity\" : 159.94144444444905,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"THIA\" : {\n" +
                "          \"label\" : \"Thiamin (B1)\",\n" +
                "          \"quantity\" : 109.19004166677993,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"RIBF\" : {\n" +
                "          \"label\" : \"Riboflavin (B2)\",\n" +
                "          \"quantity\" : 229.88528846196954,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"NIA\" : {\n" +
                "          \"label\" : \"Niacin (B3)\",\n" +
                "          \"quantity\" : 424.8538312502789,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITB6A\" : {\n" +
                "          \"label\" : \"Vitamin B6\",\n" +
                "          \"quantity\" : 421.4441730776759,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"FOLDFE\" : {\n" +
                "          \"label\" : \"Folate equivalent (total)\",\n" +
                "          \"quantity\" : 25.428437500047743,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITB12\" : {\n" +
                "          \"label\" : \"Vitamin B12\",\n" +
                "          \"quantity\" : 320.08333333333337,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITD\" : {\n" +
                "          \"label\" : \"Vitamin D\",\n" +
                "          \"quantity\" : 320.6666666666667,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"TOCPHA\" : {\n" +
                "          \"label\" : \"Vitamin E\",\n" +
                "          \"quantity\" : 89.37618333422493,\n" +
                "          \"unit\" : \"%\"\n" +
                "        },\n" +
                "        \"VITK1\" : {\n" +
                "          \"label\" : \"Vitamin K\",\n" +
                "          \"quantity\" : 59.60426041697407,\n" +
                "          \"unit\" : \"%\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"digest\" : [ {\n" +
                "        \"label\" : \"Fat\",\n" +
                "        \"tag\" : \"FAT\",\n" +
                "        \"schemaOrgTag\" : \"fatContent\",\n" +
                "        \"total\" : 208.05040250005803,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 320.0775423077816,\n" +
                "        \"unit\" : \"g\",\n" +
                "        \"sub\" : [ {\n" +
                "          \"label\" : \"Saturated\",\n" +
                "          \"tag\" : \"FASAT\",\n" +
                "          \"schemaOrgTag\" : \"saturatedFatContent\",\n" +
                "          \"total\" : 61.207636375009635,\n" +
                "          \"hasRDI\" : true,\n" +
                "          \"daily\" : 306.03818187504817,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Trans\",\n" +
                "          \"tag\" : \"FATRN\",\n" +
                "          \"schemaOrgTag\" : \"transFatContent\",\n" +
                "          \"total\" : 0.8448,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Monounsaturated\",\n" +
                "          \"tag\" : \"FAMS\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 85.78187337500766,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Polyunsaturated\",\n" +
                "          \"tag\" : \"FAPU\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 39.88905187503517,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"label\" : \"Carbs\",\n" +
                "        \"tag\" : \"CHOCDF\",\n" +
                "        \"schemaOrgTag\" : \"carbohydrateContent\",\n" +
                "        \"total\" : 47.816761250147486,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 15.938920416715828,\n" +
                "        \"unit\" : \"g\",\n" +
                "        \"sub\" : [ {\n" +
                "          \"label\" : \"Carbs (net)\",\n" +
                "          \"tag\" : \"CHOCDF.net\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 35.75772374999056,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Fiber\",\n" +
                "          \"tag\" : \"FIBTG\",\n" +
                "          \"schemaOrgTag\" : \"fiberContent\",\n" +
                "          \"total\" : 12.059037500156926,\n" +
                "          \"hasRDI\" : true,\n" +
                "          \"daily\" : 48.2361500006277,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Sugars\",\n" +
                "          \"tag\" : \"SUGAR\",\n" +
                "          \"schemaOrgTag\" : \"sugarContent\",\n" +
                "          \"total\" : 16.123463750047193,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        }, {\n" +
                "          \"label\" : \"Sugars, added\",\n" +
                "          \"tag\" : \"SUGAR.added\",\n" +
                "          \"schemaOrgTag\" : null,\n" +
                "          \"total\" : 0.0,\n" +
                "          \"hasRDI\" : false,\n" +
                "          \"daily\" : 0.0,\n" +
                "          \"unit\" : \"g\"\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"label\" : \"Protein\",\n" +
                "        \"tag\" : \"PROCNT\",\n" +
                "        \"schemaOrgTag\" : \"proteinContent\",\n" +
                "        \"total\" : 236.58131375005138,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 473.16262750010276,\n" +
                "        \"unit\" : \"g\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Cholesterol\",\n" +
                "        \"tag\" : \"CHOLE\",\n" +
                "        \"schemaOrgTag\" : \"cholesterolContent\",\n" +
                "        \"total\" : 1283.0,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 427.6666666666667,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Sodium\",\n" +
                "        \"tag\" : \"NA\",\n" +
                "        \"schemaOrgTag\" : \"sodiumContent\",\n" +
                "        \"total\" : 3945.65975000031,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 164.40248958334624,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Calcium\",\n" +
                "        \"tag\" : \"CA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 326.0403750010333,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 32.60403750010333,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Magnesium\",\n" +
                "        \"tag\" : \"MG\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 324.8095000007895,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 77.33559523828322,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Potassium\",\n" +
                "        \"tag\" : \"K\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 4014.232125010343,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 85.40919414915624,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Iron\",\n" +
                "        \"tag\" : \"FE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 16.44184625009567,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 91.34359027830926,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Zinc\",\n" +
                "        \"tag\" : \"ZN\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 22.48163750001899,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 204.3785227274454,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Phosphorus\",\n" +
                "        \"tag\" : \"P\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 2388.5722500013017,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 341.2246071430431,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin A\",\n" +
                "        \"tag\" : \"VITA_RAE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 1144.9192500113265,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 127.2132500012585,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin C\",\n" +
                "        \"tag\" : \"VITC\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 143.94730000000413,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 159.94144444444905,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Thiamin (B1)\",\n" +
                "        \"tag\" : \"THIA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 1.310280500001359,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 109.19004166677993,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Riboflavin (B2)\",\n" +
                "        \"tag\" : \"RIBF\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 2.988508750005604,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 229.88528846196954,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Niacin (B3)\",\n" +
                "        \"tag\" : \"NIA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 67.97661300004462,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 424.8538312502789,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin B6\",\n" +
                "        \"tag\" : \"VITB6A\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 5.478774250009787,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 421.4441730776759,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folate equivalent (total)\",\n" +
                "        \"tag\" : \"FOLDFE\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 101.71375000019098,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 25.428437500047743,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folate (food)\",\n" +
                "        \"tag\" : \"FOLFD\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 101.71375000019098,\n" +
                "        \"hasRDI\" : false,\n" +
                "        \"daily\" : 0.0,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Folic acid\",\n" +
                "        \"tag\" : \"FOLAC\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 0.0,\n" +
                "        \"hasRDI\" : false,\n" +
                "        \"daily\" : 0.0,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin B12\",\n" +
                "        \"tag\" : \"VITB12\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 7.682,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 320.08333333333337,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin D\",\n" +
                "        \"tag\" : \"VITD\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 48.1,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 320.6666666666667,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin E\",\n" +
                "        \"tag\" : \"TOCPHA\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 13.406427500133741,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 89.37618333422493,\n" +
                "        \"unit\" : \"mg\"\n" +
                "      }, {\n" +
                "        \"label\" : \"Vitamin K\",\n" +
                "        \"tag\" : \"VITK1\",\n" +
                "        \"schemaOrgTag\" : null,\n" +
                "        \"total\" : 71.52511250036889,\n" +
                "        \"hasRDI\" : true,\n" +
                "        \"daily\" : 59.60426041697407,\n" +
                "        \"unit\" : \"µg\"\n" +
                "      } ]\n" +
                "    },\n" +
                "    \"bookmarked\" : false,\n" +
                "    \"bought\" : false\n" +
                "  }]}";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Response r = objectMapper.readValue(jsonResponse, Response.class);

        List<Hits> lH = r.getHits();



        System.out.println(lH.size());
        for (int i = 0; i < lH.size(); i++) {
            System.out.println(lH.get(i).getRecipe().getLabel());
            System.out.println(lH.get(i).getRecipe().getIngredientLines());
        }


    }
}
