java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
-source src/org \
src/org/argouml/configuration src/org/tigris \
src/Acme/JPM/Encoders \
-lib /usr/lib/jvm/java-8-openjdk-amd64/ ~/.gradle/ ~/.m2 \
-output tahap1.sqlite -JV 1.8


# java -jar ~/JCodeOdor-Launcher-1.0-standalone.jar \
# -source src/org/argouml/ \
# src/org/tigris/ src/Acme/ src/org/omg ../argouml-core-model/src/ ../argouml-core-model-euml/src/ ../argouml-core-model-mdr/src/ \
# src/tudresden \
# -lib /usr/lib/jvm/java-8-openjdk-amd64/ ~/.gradle/ ~/.m2 \
# src/org/omg/lib \
# -output test.sqlite -JV 1.8

