include u-boot-stm32mp1-dhsom.inc
require u-boot.inc
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

SRCBRANCH ??= "dev/2020.01_dhsom"

SRC_URI = "\
    git://github.com/dh-electronics/u-boot-stm32mp1.git;protocol=https;branch=${SRCBRANCH}\
"

DEPENDS += "bc-native dtc-native"

PV = "v2020.01"
BB_STRICT_CHECKSUM = "0"

# use latest source
SRCREV = "${AUTOREV}"

RPROVIDES_${PN} += "u-boot"

DEPENDS_append_dhsomstm32mp1 = "u-boot-mkimage-native"
SRC_URI_append_dhsomstm32mp1 = " file://boot.cmd "
do_compile_append_dhsomstm32mp1 () {
	uboot-mkimage -A arm -T script -C none \
		-d ${WORKDIR}/boot.cmd ${WORKDIR}/boot.scr
}
