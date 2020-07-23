include u-boot-stm32mp1-dhsom.inc
require u-boot.inc
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

SRCBRANCH ??= "dev/2020.04_dhsom"

SRC_URI = "\
    git://github.com/dh-electronics/u-boot-stm32mp1.git;protocol=https;branch=${SRCBRANCH}\
    file://boot.cmd \
"
SRC_URI_append = " file://boot.cmd "
DEPENDS += "bc-native dtc-native"

PV = "v2020.04"
BB_STRICT_CHECKSUM = "0"

# use latest source
SRCREV = "${AUTOREV}"

RPROVIDES_${PN} += "u-boot"


