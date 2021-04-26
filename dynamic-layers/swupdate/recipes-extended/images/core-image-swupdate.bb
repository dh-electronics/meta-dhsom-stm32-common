SUMMARY = "Rootfile system for swupdate as rescue system for drc rubin"
DESCRIPTION = "Root FS to start swupdate in rescue mode	\
		"
LICENSE = "MIT"
require recipes-extended/images/swupdate-image.inc
IMAGE_ROOTFS_SIZE = "100000"

PACKAGE_INSTALL_append_dh-stm32mp1-dhsom = " \
	libubootenv-bin \
	libgpiod \
	e2fsprogs-mke2fs \
"
IMAGE_FSTYPES_append_dh-stm32mp1-dhsom = " ${INITRAMFS_FSTYPES} "

SWUPDATE_INIT_dh-stm32mp1-dhsom = "tiny"
